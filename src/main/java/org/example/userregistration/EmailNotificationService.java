package org.example.userregistration;

import org.springframework.beans.factory.annotation.Value;

public class EmailNotificationService implements NotificationService {
    @Value("${spring.application.name}")
    private String host;

    @Value("${server.port}")
    private String port;

    @Override
    public void send (String message, String recipientEmail) {
        System.out.println("Host name: " + host);
        System.out.println("Port: " + port);
        System.out.println("Sending email to " + recipientEmail);
        System.out.println("Message: " + message);
    }
}
