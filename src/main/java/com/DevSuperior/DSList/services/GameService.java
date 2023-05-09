package com.DevSuperior.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevSuperior.DSList.dto.GameMinDTO;
import com.DevSuperior.DSList.entities.Game;
import com.DevSuperior.DSList.repositories.GameRepositoy;

@Service
public class GameService {

	@Autowired
	private GameRepositoy gameRepositoy;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepositoy.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();	
	}
	
}
