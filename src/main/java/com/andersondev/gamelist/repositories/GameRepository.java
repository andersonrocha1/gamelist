package com.andersondev.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andersondev.gamelist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long> {

}
