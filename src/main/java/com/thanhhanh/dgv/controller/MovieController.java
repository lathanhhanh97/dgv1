package com.thanhhanh.dgv.controller;

import com.thanhhanh.dgv.entity.Movie;
import com.thanhhanh.dgv.model.ResponseData;
import com.thanhhanh.dgv.repository.MovieRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @ApiOperation(value = "Lấy danh sách movie", response = Movie.class, responseContainer = "List")
    @GetMapping("")
    public ResponseData<Movie> getAllUser() {
        if(movieRepository.findAll() != null)
            return new ResponseData(HttpStatus.OK, "success", movieRepository.findAll());
        return new ResponseData(HttpStatus.NOT_FOUND, "failed", null);
    }


    @ApiOperation(value = "Lấy thông tin của một movie")
    @GetMapping("/{id}")
    public ResponseData<Movie> responseData(@PathVariable Integer id) {
        if(movieRepository.findMovieById(id) != null)
            return new ResponseData(HttpStatus.OK, "success", movieRepository.findMovieById(id));
        return new ResponseData(HttpStatus.NOT_FOUND, "failed", null);
    }

}
