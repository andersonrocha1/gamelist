package com.andersondev.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondev.gamelist.entities.GameList;


public interface GameListRepository extends JpaRepository<GameList, Long> {

}
