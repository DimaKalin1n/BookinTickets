package com.example.bookingticket.service.seat;

import com.example.bookingticket.model.seat.Seat;
import java.util.List;

public interface SeatServiceInterface {
    Long create(Seat seat) throws Exception;

    List<Seat> getSessionSeat(Long sessionId);

    Seat getSeatInfo(Long id);

    boolean update(Seat seat, Long id);

    boolean delete(Long id);


}
