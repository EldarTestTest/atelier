package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.Season;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SeasonRepository extends MongoRepository<Season, String> {

    Season findAllById(String id);

    Season findAllByUuid(UUID uuid);

    Season findAllByIdAndUuid(String id, UUID uuid);

    Season findAllByName(String name);

}
