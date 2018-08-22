package com.dreamteam.atelier.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Базовый тип описывающий сущность - избранные пользователя
 */
@Document(collection = "favorites")
@TypeAlias(value = "favorite")
public class Favorite {

    @Id
    private String id;
    @Indexed(unique = true)
    private UUID uuid;
    @DBRef
    private List<Item> items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

    public void addItem(Item item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
    }

    public void removeItem(Item item) {
        if (items != null) {
            items.remove(item);
        }
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
