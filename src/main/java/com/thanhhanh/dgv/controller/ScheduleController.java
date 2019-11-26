package com.thanhhanh.dgv.controller;

import com.thanhhanh.dgv.entity.Schedule;
import com.thanhhanh.dgv.repository.ScheduleRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    ScheduleRepository scheduleRepository;

    @ApiOperation(value = "Lấy danh sách user", response = Schedule.class, responseContainer = "List")
    @GetMapping("")
    public List<Schedule> getAllUser() {
        return scheduleRepository.findAll();
    }
}
