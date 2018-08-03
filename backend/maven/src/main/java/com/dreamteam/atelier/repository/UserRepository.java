package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.User;
import com.dreamteam.atelier.model.domain.UserAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends MongoRepository<User, Long> {

    User findUserByIdAndUuid(long id, UUID uuid);

    User findUserById(long id);

    User findUserByUuid(UUID uuid);

    User findAllByEmail(String email);

    User findAllByLogin(String login);

    User findAllByNikname(String nikname);

    User findAllByMobile(String mobile);

    User findAllByUserAddress(UserAddress userAddress);

    List<User> findAllByName(String name);

    List<User> findAllBySurname(String surname);

    List<User> findAllByMiddlename(String middlename);

    List<User> findAllByNameAndSurname(String name, String surname);

    List<User> findAllByNameAndMiddlename(String name, String middlename);

    List<User> findAllByNameAndSurnameAndMiddlename(String name, String surname, String middlename);

    User findAllByPassword(String password); //честно говоря этот метод запрещено юзаять, только для тестов

}
