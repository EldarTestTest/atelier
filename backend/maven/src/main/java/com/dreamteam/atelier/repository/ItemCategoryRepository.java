package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.ItemCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ItemCategoryRepository extends MongoRepository<ItemCategory, Long> {

    ItemCategory findAllById(long id);

    ItemCategory findAllByUuid(UUID uuid);

    ItemCategory findAllByIdAndUuid(long id, UUID uuid);

    ItemCategory findAllByName(String name);

}
