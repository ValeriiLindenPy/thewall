package com.wall.thewall.Repository;

import java.util.List;
import com.wall.thewall.Model.Message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WallMessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByWallId(Long wallId);
}