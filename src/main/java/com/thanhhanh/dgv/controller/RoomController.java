package com.thanhhanh.dgv.controller;

import com.thanhhanh.dgv.model.Room;
import com.thanhhanh.dgv.repository.RoomRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    RoomRepository roomRepository;

    @ApiOperation(value = "Lấy danh sách room", response = Room.class, responseContainer = "List")
    @GetMapping("")
    public List<Room> getAllRoom() {
        return roomRepository.findAll();
    }

    @ApiOperation(value = "Lấy thông tin của một room")
    @GetMapping("/{id}")
    public Room getAllRoom(@PathVariable Integer id) {
        return roomRepository.getRoomById(id);
    }
}
