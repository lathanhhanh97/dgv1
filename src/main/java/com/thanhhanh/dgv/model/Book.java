package com.thanhhanh.dgv.model;

import javax.persistence.*;

@Entity
@Table(name = "booking")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="booking_id")
    private int bookId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "schedule_id")
    private int scheduleId;

    @Column(name = "seat_id")
    private int seatId;

    @Column(name = "price")
    private double price;

    @Column(name = "seat_status")
    private boolean seatStatus;

    public Book() {
    }

    public Book(int userId, int scheduleId, int seatId, double price, boolean seatStatus) {
        this.userId = userId;
        this.scheduleId = scheduleId;
        this.seatId = seatId;
        this.price = price;
        this.seatStatus = seatStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(boolean seatStatus) {
        this.seatStatus = seatStatus;
    }
}
