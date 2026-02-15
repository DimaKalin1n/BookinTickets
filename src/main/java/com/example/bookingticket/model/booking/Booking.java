package com.example.bookingticket.model.booking;

import com.example.bookingticket.model.seat.Seat;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="session_id")
    private int seansId;

    @Column(name="buyer_name")
    private String customerName;

    @Column(name = "seats_list")
    @ElementCollection
    private List<Seat> seatsList;



    public Booking(){};

    public Booking(int id, int seansId, String customerName, List<Seat> seatsList) {
        this.id = id;
        this.seansId = seansId;
        this.customerName = customerName;
        this.seatsList = seatsList;
    }


    public int getId() {
        return id;
    }

    public int getSeansId() {
        return seansId;
    }

    public List<Seat> getSeatsList() {
        return seatsList;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setSeatsList(List<Seat> seatsList) {
        this.seatsList = seatsList;
    }

    public void setSeansId(int seansId) {
        this.seansId = seansId;
    }

}
