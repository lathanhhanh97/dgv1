package com.thanhhanh.dgv.controller;

import com.thanhhanh.dgv.model.Cinema;
import com.thanhhanh.dgv.repository.CinemaRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {
    @Autowired
    CinemaRepository cinemaRepository;

    @ApiOperation(value = "Lấy danh sách cinema", response = Cinema.class, responseContainer = "List")
    @GetMapping("")
    public List<Cinema> getAllUser() {
        return cinemaRepository.findAll();
    }

    @ApiOperation(value = "Lấy thông tin của một cinema")
    @GetMapping("/{id}")
    public Cinema findCinemeById(@PathVariable Integer id) {
        return cinemaRepository.findCinemeById(id);
    }
}
