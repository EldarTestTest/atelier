package com.dreamteam.atelier.model.local;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ProductTop {

    String Id;
    UUID uuid;
    String itemId;
    String userId;
    Integer value;

}
