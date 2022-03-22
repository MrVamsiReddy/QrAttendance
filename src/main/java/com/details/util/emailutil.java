package com.details.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class emailutil {
	
	@Autowired
	JavaMailSender mailsender;
	
	public void sendemail(String toAddress, String emailSubject, String emailBody) {
		
		MimeMessage message = mailsender.createMimeMessage();
		MimeMessageHelper messagehelper = new MimeMessageHelper(message);
		try {
			
			messagehelper.setTo(toAddress);
			messagehelper.setText(emailSubject);
			messagehelper.setSubject(emailBody);
			mailsender.send(message);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
