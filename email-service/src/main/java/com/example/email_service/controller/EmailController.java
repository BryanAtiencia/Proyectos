package com.example.emailservice.controller;

import com.example.emailservice.model.EmailRequest;
import com.example.emailservice.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailRequest emailRequest) {
        emailService.sendSimpleEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getText());
        return "Email sent successfully";
    }
}
