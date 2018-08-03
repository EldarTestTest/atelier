package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.UserAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserAddressRepository extends MongoRepository<UserAddress, Long> {

    UserAddress findUserAddressByIdAndUuid(long id, UUID uuid);

    UserAddress findUserAddressById(long id);

    UserAddress findUserAddressByUuid(UUID uuid);

}
