package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/mail")
public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;

    /*The Data included in request body according to MailDetailsDTO*/
    @PostMapping("/send")
    public String sendEmail(@RequestBody MailDetailsDTO mailDetailsDTO){

        try{

            SimpleMailMessage message = new SimpleMailMessage();
            message.setSubject(mailDetailsDTO.getSubject());
            message.setTo(mailDetailsDTO.getToMail());
            message.setFrom("akmuthumala@gmail.com");
            message.setText(mailDetailsDTO.getMessage());

            javaMailSender.send(message);

            return "Success";

        }
        catch (Exception ex){

            return ex.getMessage();

        }

    }

}
