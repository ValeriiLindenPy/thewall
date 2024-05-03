package com.wall.thewall.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wall.thewall.Model.Wall;
import com.wall.thewall.Repository.WallRepository;
import com.wall.thewall.Service.WallService;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor
public class WallServiceAPI implements WallService {

    private final WallRepository repository;

    @Override
    public List<Wall> getAllWalls() {

        return repository.findAll();
    }

    @Override
    public String createWall(Wall wall) {

        repository.save(wall);
        return "Wall created successfully";
    }

    @Override
    public Optional<Wall> findWallById(Long id) {
        return repository.findById(id);
    }

    @Override
    public String deleteWallById(Long id) {
        repository.deleteById(id);
        return "The wall was dleted successfully";
    }

    @Override
    public String updateWall(Wall wall, Long id) {

        Optional<Wall> optionalWall = repository.findById(id);

        if (optionalWall.isPresent()) {

            Wall existingWall = optionalWall.get();
            if (wall.getName() != null) {
                existingWall.setName(wall.getName());
            }

            if (wall.getMessages() != null) {
                existingWall.setMessages(wall.getMessages());
            }
            repository.save(existingWall);
            

        } else {
            throw new IllegalArgumentException("No such wall in db");
        }

        return "The wall is updated successfully";
    }
     
        

  

 
    
}
