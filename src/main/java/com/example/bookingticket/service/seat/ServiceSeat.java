package com.example.bookingticket.service.seat;

import com.example.bookingticket.model.seat.Seat;
import com.example.bookingticket.repository.seat.SeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSeat implements SeatServiceInterface {

    private final SeatRepository seatRepository;

    public ServiceSeat(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }


    private boolean validData(Seat seat) throws Exception {
        return seat.getSeatNumber() != null && seat.getRowNumber() != null && seat.getSessionId() != null;
    }
    @Override
    public Long create(Seat seat) throws Exception {
        validData(seat);
        seat.setFree(true);
        var newSeat = seatRepository.save(seat);
        return newSeat.getId();
    }

    @Override
    public List<Seat> getSessionSeat(Long sessionId) {
        return List.of();
    }

    @Override
    public Seat getSeatInfo(Long id) {
        return null;
    }

    @Override
    public boolean update(Seat seat, Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }


}
