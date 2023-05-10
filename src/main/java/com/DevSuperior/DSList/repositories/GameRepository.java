package com.DevSuperior.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevSuperior.DSList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
	
}
