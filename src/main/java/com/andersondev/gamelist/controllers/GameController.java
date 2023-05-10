package com.andersondev.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andersondev.gamelist.dto.GameMinDTO;
import com.andersondev.gamelist.dto.GameTodosDTO;
import com.andersondev.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/api/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		
		List<GameMinDTO> result = gameService.findAll();
		return result;
		
	}
	
	@GetMapping(value = "/{id}")
	public GameTodosDTO findById(@PathVariable Long id){
		
		GameTodosDTO result = gameService.findById(id);
		return result;
		
	}

}
