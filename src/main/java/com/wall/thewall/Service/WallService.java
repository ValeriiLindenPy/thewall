package com.wall.thewall.Service;

import java.util.List;
import java.util.Optional;

import com.wall.thewall.Model.Wall;

public interface WallService {


    List<Wall> getAllWalls();
    String createWall(Wall wall);
    Optional<Wall> findWallById(Long id);
    String deleteWallById(Long id);
    String updateWall(Wall wall, Long id);

} 
