package me.yling.springboot13.repositories;

import me.yling.springboot13.models.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepo extends CrudRepository<Actor, Long> {
}
