package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.ItemType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ItemTypeRepository extends MongoRepository<ItemType, Long> {

    ItemType findAllById(long id);

    ItemType findAllByUuid(UUID uuid);

    ItemType findAllByIdAndUuid(long id, UUID uuid);

    ItemType findAllByName(String name);

}
