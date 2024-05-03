package com.wall.thewall.Controller;


import org.springframework.web.bind.annotation.*;

import com.wall.thewall.Model.Wall;
import com.wall.thewall.Service.WallService;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping("/api/v1/walls")
@AllArgsConstructor
public class WallApiController {

    private final WallService service;

    @GetMapping
    public List<Wall> getAllWalls() {
        return service.getAllWalls();
    }

    @PostMapping
    public ResponseEntity<String> addWall(@RequestBody Wall wall) {
        String result = service.createWall(wall);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping(value = "/{id}")
    public Optional<Wall> getWallById(@PathVariable("id") Long id) {
        return service.findWallById(id);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteWallById(@PathVariable("id") Long id) {
        return service.deleteWallById(id);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<String> updateWall(@PathVariable("id") Long id,@RequestBody Wall wall) {
        String result = service.updateWall(wall, id);
        return ResponseEntity.ok().body(result);
    }
    
}
