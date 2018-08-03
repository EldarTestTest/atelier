package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.Season;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SeasonRepository extends MongoRepository<Season, Long> {

    Season findAllById(long id);

    Season findAllByUuid(UUID uuid);

    Season findAllByIdAndUuid(long id, UUID uuid);

    Season findAllByName(String name);

}
