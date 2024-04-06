package com.example.Dijkstra.controller;

import com.example.Dijkstra.model.ShortestPathResult;
import com.example.Dijkstra.service.ShortestPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ShortestPathController {

    private final ShortestPathService shortestPathService;

    @Autowired
    public ShortestPathController(ShortestPathService shortestPathService) {
        this.shortestPathService = shortestPathService;
    }

    @GetMapping("/shortest-path")
    public ShortestPathResult findShortestPath(
            @RequestParam("start") String start,
            @RequestParam("end") String end) {
        return shortestPathService.findShortestPath(start, end);
    }
}
