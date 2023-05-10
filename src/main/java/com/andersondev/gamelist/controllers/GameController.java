package com.andersondev.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andersondev.gamelist.dto.GameDTO;
import com.andersondev.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/api/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameDTO> findAll(){
		
		List<GameDTO> result = gameService.findAll();
		return result;
		
	}

}
