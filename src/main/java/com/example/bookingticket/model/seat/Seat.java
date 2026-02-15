package com.example.bookingticket.model.seat;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;


@Entity
@Table(name = "seat")
public class Seat  {

    public Seat(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "session_id")
    @JsonProperty("session_id")
    private Long sessionId;

    @Column(name = "row_number")
    @JsonProperty("row_number")
    private Long rowNumber;

    @Column(name = "seat_number")
    @JsonProperty("seat_number")
    private Long seatNumber;

    @Column(name = "is_free")
    @JsonProperty("is_free")
    private boolean isFree;

    public Long getId() {
        return id;
    }

    public Long getRowNumber() {
        return rowNumber;
    }

    public Long getSeatNumber() {
        return seatNumber;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public boolean getIsFree(){
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRowNumber(Long rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public void setSeatNumber(Long seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Seat: " + getId() + " row: " +getRowNumber() + " seat: " + getSeatNumber() + " session: " + getSessionId() + " free : " + getIsFree();
    }
}


