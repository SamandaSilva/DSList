package com.DevSuperior.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DevSuperior.DSList.dto.GameDTO;
import com.DevSuperior.DSList.dto.GameMinDTO;
import com.DevSuperior.DSList.entities.Game;
import com.DevSuperior.DSList.repositories.GameRepositoy;

@Service
public class GameService {

	@Autowired
	private GameRepositoy gameRepositoy;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepositoy.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepositoy.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();	
	}
	
}
