package com.DevSuperior.DSList.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DevSuperior.DSList.dto.GameListDTO;
import com.DevSuperior.DSList.entities.GameList;
import com.DevSuperior.DSList.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepositoy;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepositoy.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();	
	}
	
}
