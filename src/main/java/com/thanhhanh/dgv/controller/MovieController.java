package com.thanhhanh.dgv.controller;

import com.thanhhanh.dgv.model.Movie;
import com.thanhhanh.dgv.repository.MovieRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieRepository movieRepository;

    @ApiOperation(value = "Lấy danh sách movie", response = Movie.class, responseContainer = "List")
    @GetMapping("")
    public List<Movie> getAllUser() {
        return movieRepository.findAll();
    }

    @ApiOperation(value = "Lấy thông tin của một movie")
    @GetMapping("/{id}")
    public Movie getUser(@PathVariable Integer id) {
        return movieRepository.findMovieById(id);
    }
}
