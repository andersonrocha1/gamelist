package com.andersondev.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andersondev.gamelist.dto.GameMinDTO;
import com.andersondev.gamelist.dto.GameTodosDTO;
import com.andersondev.gamelist.entities.Game;
import com.andersondev.gamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		
		List<Game> resultGame = gameRepository.findAll();
		return resultGame.stream().map(x -> new GameMinDTO(x)).toList();
		
		
	}
	
	@Transactional(readOnly = true)
	public GameTodosDTO findById(Long id) {
		
		Game resultGame = gameRepository.findById(id).get();
		return new GameTodosDTO(resultGame);
				
	}

}
