package com.dreamteam.atelier.controller.rest;

import com.dreamteam.atelier.model.local.MessageMail;
import com.dreamteam.atelier.service.MailSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
@Slf4j
public class MailController {

    private final MailSender mailSender;

    @Autowired
    public MailController(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    /**
     * Для тестирования - отправка себе на почту тестового ссобщения
     * @return информация отправилось ли сообщение или нет
     */
    @RequestMapping(value = "/testMessage", method = RequestMethod.GET)
    public ResponseEntity<Boolean> testMessage() {
        try {
            mailSender.send("ziatdinov.eldar9@yandex.ru", "Test", "Это тестовое сообщение!");
            return new ResponseEntity<>(true, HttpStatus.OK);
        } catch (RuntimeException e) {
            log.error("Error send email", e);
            return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * /api/mail/sendEmail
     * @param messageMail данные о сообщении
     * @return информация отправилось ли сообщение или нет
     */
    @RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
    public ResponseEntity<Boolean> sendMessage(@RequestBody MessageMail messageMail) {
        try {
            mailSender.send(messageMail.getEmailTo(), messageMail.getSubject(), messageMail.getText());
            return new ResponseEntity<>(true, HttpStatus.OK);
        } catch (RuntimeException e) {
            log.error("Error send email", e);
            return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
