package com.dreamteam.atelier.model.local;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class UserFavorite {

    private String id;
    private UUID uuid;
    private String itemId;
    private List<String> itemsId;

}