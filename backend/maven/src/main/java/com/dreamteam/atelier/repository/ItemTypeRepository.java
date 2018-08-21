package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.ItemType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ItemTypeRepository extends MongoRepository<ItemType, String> {

    ItemType findAllById(String id);

    ItemType findAllByUuid(UUID uuid);

    ItemType findAllByIdAndUuid(String id, UUID uuid);

    ItemType findAllByName(String name);

}
