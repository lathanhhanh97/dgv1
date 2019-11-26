package com.thanhhanh.dgv.entity;
import javax.persistence.*;

@Entity
@Table(name="seats")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="seat_id")
    private int seatId;

    @Column(name="seat_type")
    private int seatType;

    @Column(name="room_id")
    private int roomId;

    @Column(name="row")
    private char seatRow;

    @Column(name="seat_number")
    private int seatNum;

    public Seat() {
    }

    public Seat(int seatType, int roomId, char seatRow, int seatNum) {
        this.seatType = seatType;
        this.roomId = roomId;
        this.seatRow = seatRow;
        this.seatNum = seatNum;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getSeatType() {
        return seatType;
    }

    public void setSeatType(int seatType) {
        this.seatType = seatType;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public char getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(char seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }
}
