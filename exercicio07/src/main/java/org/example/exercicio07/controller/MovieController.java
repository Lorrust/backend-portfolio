package org.example.exercicio07.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    String[][] movies = {
            {"Men in Black", "Arrival"},
            {"Shrek", "Gladiator"}
    };

    @GetMapping({})
    public String recommendMovie(@RequestParam String ambience, @RequestParam String genre) {
        if (ambience.equals("sci-fi")) {
            if (genre.equals("comedy")) {
                return "Men in Black";
            } else if (genre.equals("drama")) {
                return "Arrival";
            }
        } else if (ambience.equals("medieval")) {
            if (genre.equals("comedy")) {
                return "Shrek";
            } else if (genre.equals("drama")) {
                return "Gladiator";
            }
        }
        return "Invalid parameters";
    }
}
