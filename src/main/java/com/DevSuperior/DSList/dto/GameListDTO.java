package com.DevSuperior.DSList.dto;

import com.DevSuperior.DSList.entities.GameList;

public class GameListDTO {

	private Long id;
	private String Name;
	
	public GameListDTO() {
		
	}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		Name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return Name;
	}
	
}
