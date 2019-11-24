package com.thanhhanh.dgv.repository;

import com.thanhhanh.dgv.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoomRepository extends JpaRepository<Room, Long> {
    @Query(value = "SELECT * FROM room WHERE room_id = ?1", nativeQuery = true)
    Room getRoomById(Integer room_id);
}
