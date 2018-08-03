package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.Item;
import com.dreamteam.atelier.model.domain.ItemCategory;
import com.dreamteam.atelier.model.domain.ItemType;
import com.dreamteam.atelier.model.domain.Season;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface ItemRepository extends MongoRepository<Item, Long> {

    Item findItemByIdAndUuid(long id, UUID uuid);

    Item findItemById(long id);

    Item findItemByUuid(UUID uuid);

    List<Item> findAllByName(String name);

    List<Item> findAllByDimensionsContains(List<String> dimensions);

    List<Item> findAllBySale(Integer sale);

    List<Item> findAllBySaleBetween(Integer sale, Integer sale2);

    List<Item> findAllByItemCategory(List<ItemCategory> itemCategory);

    List<Item> findAllByItemCategoryContains(List<ItemCategory> itemCategory);

    List<Item> findAllByItemType(List<ItemType> itemType);

    List<Item> findAllByItemTypeContains(List<ItemType> itemType);

    List<Item> findAllBySeason(Season season);

}
