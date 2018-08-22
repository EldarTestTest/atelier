package com.dreamteam.atelier.model.local;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class SystemFile {

    private String id;
    private UUID uuid;
    private String name;
    private String link;
    private byte[] data;

}
