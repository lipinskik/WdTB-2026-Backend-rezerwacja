package pl.wsb.rezerwacja.booking.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_name", nullable = false, length = 60)
    private String roomName;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "total_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalPrice;

    @Column(name = "confirmed", nullable = false)
    private Boolean confirmed;

    protected Booking() {
    }

    public Booking(String roomName, LocalDateTime startTime, LocalDateTime endTime, BigDecimal totalPrice, Boolean confirmed) {
        this.roomName = roomName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalPrice = totalPrice;
        this.confirmed = confirmed;
    }

    public Long getId() {
        return id;
    }

    public String getRoomName() {
        return roomName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }
}