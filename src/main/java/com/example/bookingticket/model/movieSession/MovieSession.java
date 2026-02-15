package com.example.bookingticket.model.movieSession;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "movie_session")
public class MovieSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "ticket_price")
    private Long ticketPrice;


    public Long getId() {
        return id;
    }

    public Long getTicketPrice() {
        return ticketPrice;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setTicketPrice(Long ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

}
