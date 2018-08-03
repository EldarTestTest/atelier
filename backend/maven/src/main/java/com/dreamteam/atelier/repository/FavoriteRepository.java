package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.Favorite;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface FavoriteRepository extends MongoRepository<Favorite, Long> {

    Favorite findAllById(long id);

    Favorite findAllByUuid(UUID uuid);

    Favorite findAllByIdAndUuid(long id, UUID uuid);

}
