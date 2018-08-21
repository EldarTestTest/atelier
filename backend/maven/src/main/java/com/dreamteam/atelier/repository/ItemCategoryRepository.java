package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.ItemCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ItemCategoryRepository extends MongoRepository<ItemCategory, String> {

    ItemCategory findAllById(String id);

    ItemCategory findAllByUuid(UUID uuid);

    ItemCategory findAllByIdAndUuid(String id, UUID uuid);

    ItemCategory findAllByName(String name);

}
