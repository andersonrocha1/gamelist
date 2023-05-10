package com.andersondev.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andersondev.gamelist.dto.GameDTO;
import com.andersondev.gamelist.entities.Game;
import com.andersondev.gamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameDTO> findAll(){
		
		List<Game> resultGame = gameRepository.findAll();
		return resultGame.stream().map(x -> new GameDTO(x)).toList();
		
		
	}

}
