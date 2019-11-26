package com.thanhhanh.dgv.controller;

import com.thanhhanh.dgv.entity.Movie;
import com.thanhhanh.dgv.model.DetailMovieResponse;
import com.thanhhanh.dgv.model.ResponseData;
import com.thanhhanh.dgv.repository.MovieRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    final private MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @ApiOperation(value = "Lấy danh sách movie", response = Movie.class, responseContainer = "List")
    @GetMapping("")
    public ResponseData<Movie> getAllUser() {
        return new ResponseData("success", "done", movieRepository.findAll());
    }


    @ApiOperation(value = "Lấy thông tin của một movie")
    @GetMapping("/{id}")
    public ResponseData<Movie> responseData(@PathVariable Integer id) {
        return new ResponseData("success", "done", movieRepository.findMovieById(id));
    }

}
