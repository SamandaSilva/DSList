package com.DevSuperior.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevSuperior.DSList.entities.Game;

public interface GameRepositoy extends JpaRepository<Game, Long> {

	
	
}
