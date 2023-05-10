package com.DevSuperior.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevSuperior.DSList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
