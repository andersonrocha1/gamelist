package com.andersondev.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andersondev.gamelist.dto.GameListDTO;
import com.andersondev.gamelist.entities.GameList;
import com.andersondev.gamelist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		
		List<GameList> resultGame = gameListRepository.findAll();
		return resultGame.stream().map(x -> new GameListDTO(x)).toList();
		
		
	}
	
	

}
