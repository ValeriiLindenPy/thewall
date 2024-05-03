package com.wall.thewall.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wall.thewall.Model.Wall;



@Repository
public interface WallRepository extends JpaRepository<Wall, Long>{
    
}
