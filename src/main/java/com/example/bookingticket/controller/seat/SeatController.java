package com.example.bookingticket.controller.seat;

import com.example.bookingticket.model.seat.Seat;
import com.example.bookingticket.service.seat.ServiceSeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/seats")
public class SeatController {

    final ServiceSeat serviceSeat;

    @Autowired //
    public SeatController(ServiceSeat serviceSeat){
        this.serviceSeat = serviceSeat;
    }


    @PostMapping
    @RequestMapping("/create")
    public ResponseEntity<?> createSeat(@RequestBody Seat seat){
         try {
             Long seatId = serviceSeat.create(seat);
             Map<String, String> coolBody = new HashMap<>();
             coolBody.put("Seat created", seat.toString());
             coolBody.put("status", "Success");
             return new ResponseEntity<>(coolBody, HttpStatus.CREATED);
         }catch (Exception e){
             System.out.println("Ошибка при создании");
             Map<String, String> badBody = new HashMap<>();
             badBody.put("status", "Bad Request");
             return new ResponseEntity<>(badBody, HttpStatus.BAD_REQUEST);
         }
    }

}
