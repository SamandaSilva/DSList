package com.DevSuperior.DSList.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DevSuperior.DSList.dto.GameListDTO;
import com.DevSuperior.DSList.entities.GameList;
import com.DevSuperior.DSList.projections.GameMinProjection;
import com.DevSuperior.DSList.repositories.GameListRepository;
import com.DevSuperior.DSList.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepositoy;

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepositoy.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();	
	}
	
	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for(int i = min; i <= max; i++) {
			gameListRepositoy.updateBelongingPosition(listId, list.get(i).getId(), i);
		}


	}
	
}
