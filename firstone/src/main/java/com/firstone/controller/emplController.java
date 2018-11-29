package com.firstone.controller;

import com.firstone.service.emplserviceinterface;
import com.firstone.controller.loginbean;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.firstone.model.emp;

@Controller
public class emplController {

	@Autowired
	private emplserviceinterface esi;

	@RequestMapping("/view")
	public ModelAndView empllist(ModelAndView model) throws IOException {
		List<emp> empllist = esi.getempl();
		model.addObject("empllist", empllist);
		model.setViewName("afterlogin");
		return model;

	}

	@RequestMapping(value = "/view", method = RequestMethod.POST)
	public ModelAndView add(ModelAndView model, @ModelAttribute("e2") emp e2, @ModelAttribute("l") loginbean l)
			throws IOException {
		if (l.getOtp().equals(temp_3)) {
			List<emp> empllist = esi.getempl();
			model.addObject("empllist", empllist);
			esi.addempl(e2);
			model.setViewName("afterlogin");
			return model;
		}
		List<emp> empllist = esi.getempl();
		model.addObject("empllist", empllist);
		model.setViewName("afterlogin");
		return model;
	}

	String otp1 = "";

	@RequestMapping(value = "/view", params = "action1")
	public ModelAndView addotp(ModelAndView model, @ModelAttribute("e2") emp e2) throws IOException {
		emplController ec = new emplController();
		otp1 = ec.generateOTP();
		demo(otp1);
		ec.sendMail(e2.getEmail(), otp1, "confirm message");
		List<emp> empllist = esi.getempl();
		model.addObject("empllist", empllist);
		model.setViewName("afterlogin");
		return model;

	}

	public String generateOTP() {
		Random random = new Random();
		String id = String.format("%04d", random.nextInt(10000));
		return id;
	}

	public String temp_3 = null;

	public void demo(String temp_otp2) {
		this.temp_3 = temp_otp2;
	}

	public String sendMail(String to, String message, String subject) {
		// final Person p = new Person();
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("mhict.mum2999@gmail.com", "mhict@123");
			}
		});

		Message message1 = new MimeMessage(session);
		try {

			message1.setFrom(new InternetAddress("test@gmail.com"));
			message1.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message1.setSubject(subject);
			message1.setText(message);
			Transport.send(message1);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		return "emp";

	}
}
