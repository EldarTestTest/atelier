package com.dreamteam.atelier.model.local;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class MessageMail {

    private String emailTo;
    private String subject;
    private String text;

}
