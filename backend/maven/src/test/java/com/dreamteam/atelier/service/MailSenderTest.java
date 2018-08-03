package com.dreamteam.atelier.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailSenderTest {

    @Autowired
    private MailSender mailSender;

    @Test
    public void send() {
        mailSender.send("ziatdinov.eldar9@gmail.com","test","TEST");
    }
}