package pl.wsb.rezerwacja.booking.entity;

import jakarta.persistence.*;
import pl.wsb.rezerwacja.client.entity.Client;
import pl.wsb.rezerwacja.room.entity.Room;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

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

    public Booking(Room room, Client client, LocalDateTime startTime, LocalDateTime endTime, BigDecimal totalPrice, Boolean confirmed) {
        this.room = room;
        this.client = client;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalPrice = totalPrice;
        this.confirmed = confirmed;
    }

    public Long getId() { return id; }
    public Room getRoom() { return room; }
    public Client getClient() { return client; }
    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public BigDecimal getTotalPrice() { return totalPrice; }
    public Boolean getConfirmed() { return confirmed; }
}