package com.dreamteam.atelier.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

/**
 * Базовый тип описывающий сущность - рейтинг
 */
@Document(collection = "top")
@TypeAlias(value = "top")
public class Top {

    @Id
    private long id;
    @Indexed(unique = true)
    private UUID uuid;
    private Integer value; //значение рейтинга
    @DBRef
    private Item item; //товар
    @DBRef
    private User user; //пользователь

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
