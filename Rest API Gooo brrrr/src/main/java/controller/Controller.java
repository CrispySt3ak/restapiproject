package controller;

import domain.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.PlayerRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cuteProject")
public class Controller {

  /**  i love youuuuuuuuu */
    private final PlayerRepository playerRepository;

    @GetMapping("/players")
    public List<?> getAllPlayers() {
        System.out.println("NUTTEEEEEEEEEE");
        return playerRepository.findAll();
    }

    @PostMapping("/playerArchives")
    public Player createPlayer(@RequestBody Player player) {
        return playerRepository.save(player);
    }
}
