package com.mud.game.player;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PlayerService {
    @GetMapping
    List<Player> getPlayer() {
        return List.of(
                new Player(
                        1L,
                        "Kevin",
                        "email@email.com",
                        1
                )
        );
    }
}
