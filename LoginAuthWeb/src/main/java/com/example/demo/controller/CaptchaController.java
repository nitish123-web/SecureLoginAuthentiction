package com.example.demo.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.imageio.ImageIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo.service.EmployeeService;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class CaptchaController {

	@Autowired
	private DefaultKaptcha captchaProducer;
	
	
	@Autowired
	EmployeeService EmployeeService;
	
	
	
	@GetMapping("/captcha")
	public void  getCaptcha(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		
		resp.setContentType("image/png");
		String capchaText =captchaProducer.createText();
		req.getSession().setAttribute("captcha", capchaText);
		BufferedImage image=captchaProducer.createImage(capchaText);
		ImageIO.write(image, "png", resp.getOutputStream());
		
	}
	
	
	@PostMapping("/Auth")
	public String verifyCaptcha(@RequestParam("captchaInput") String captchaInput,
			                    @RequestParam("empid") String Empid,
			                    @RequestParam("pass") String pass,
			                    HttpServletRequest req,
			                    Model model) throws NoSuchAlgorithmException {
		
		String StoredCaptcha=(String) req.getSession().getAttribute("captcha");
		if(StoredCaptcha == null || !StoredCaptcha.equalsIgnoreCase(captchaInput)) {
			return "captchaerror.jsp";
		}
		
		boolean isAuthenticated = EmployeeService.authenticteuser(Empid, pass);
		if(!isAuthenticated) {
			return "loginerror.jsp";
		}
		
//		String response=RegisterService.registeruser(emp);
//		model.addAttribute("message",response);
//		return "success";

		req.getSession().setAttribute("user", Empid);
		if(isAuthenticated=true) {
			model.addAttribute("message", "Logged in Succesfull !");
		}
		return "success";
		
		
		
	}
	
	
	
}
