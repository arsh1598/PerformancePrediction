package com.github.cricket.Repositories;

import com.github.cricket.entity.Players;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayersRepository extends MongoRepository<Players, Long> {
}
