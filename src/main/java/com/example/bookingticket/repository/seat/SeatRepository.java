package com.example.bookingticket.repository.seat;

import com.example.bookingticket.model.seat.Seat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SeatRepository extends JpaRepository<Seat, Long> {
// JpaRepository автоматически добавляет базовые методы  save(), findById(), findAll()
}
