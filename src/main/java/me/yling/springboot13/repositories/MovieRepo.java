package me.yling.springboot13.repositories;

import me.yling.springboot13.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepo extends CrudRepository <Movie, Long> {
}
