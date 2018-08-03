package com.dreamteam.atelier.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Базовый тип который описывает сущность - товар
 */
@Document(collection = "items")
@TypeAlias(value = "item")
public class Item {

    @Id
    private String id;
    @Indexed(unique = true)
    private UUID uuid;
    private String name; //наименование
    private String description; //описание
    @DBRef
    private List<CommonFile> commonFiles; //файлы-фоточки
    private List<String> dimensions; //размеры
    private Double price; //цена
    private LocalDateTime createDate; //дата создания
    private Integer sale; //скидка
    @DBRef
    private List<ItemCategory> itemCategory; //катеории товара
    @DBRef
    private List<ItemType> itemType; //типы товара
    @DBRef
    private Season season;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<CommonFile> getCommonFiles() {
        return commonFiles;
    }

    public void setCommonFiles(List<CommonFile> commonFiles) {
        this.commonFiles = commonFiles;
    }

    public List<String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<String> dimensions) {
        this.dimensions = dimensions;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public List<ItemCategory> getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(List<ItemCategory> itemCategory) {
        this.itemCategory = itemCategory;
    }

    public List<ItemType> getItemType() {
        return itemType;
    }

    public void setItemType(List<ItemType> itemType) {
        this.itemType = itemType;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
