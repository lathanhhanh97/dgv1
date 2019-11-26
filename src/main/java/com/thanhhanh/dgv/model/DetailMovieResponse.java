package com.thanhhanh.dgv.model;

import com.thanhhanh.dgv.entity.Movie;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class DetailMovieResponse {
    private String status;
    private String msg;
    private Movie data;

    public DetailMovieResponse(String status, String msg, Movie data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Movie getData() {
        return data;
    }

    public void setData(Movie data) {
        this.data = data;
    }
}
