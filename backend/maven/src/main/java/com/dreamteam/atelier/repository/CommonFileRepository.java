package com.dreamteam.atelier.repository;

import com.dreamteam.atelier.model.domain.CommonFile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface CommonFileRepository extends MongoRepository<CommonFile, Long> {

    CommonFile findCommonFileById(long id);

    CommonFile findCommonFileByUuid(UUID uuid);

    CommonFile findCommonFileByIdAndUuid(long id, UUID uuid);

    List<CommonFile> findCommonFileByName(String name);

}
