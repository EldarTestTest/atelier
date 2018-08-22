package com.dreamteam.atelier.model.local;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ProductSeason {

    private String id;
    private UUID uuid;
    private String name;
    private String description;

}
