package com.DevSuperior.DSList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DevSuperior.DSList.dto.GameMinDTO;
import com.DevSuperior.DSList.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> finAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;	
	}
	
}
