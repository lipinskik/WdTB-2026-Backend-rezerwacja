package pl.wsb.rezerwacja.room.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 60)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "room_type", nullable = false, length = 20)
    private RoomType roomType;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "hourly_price", nullable = false, precision = 10, scale = 2)
    private BigDecimal hourlyPrice;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Embedded
    private Address address;

    protected Room() {
    }

    public Room(String name, RoomType roomType, Integer capacity,
                BigDecimal hourlyPrice, Boolean active, Address address) {
        this.name = name;
        this.roomType = roomType;
        this.capacity = capacity;
        this.hourlyPrice = hourlyPrice;
        this.active = active;
        this.address = address;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public RoomType getRoomType() { return roomType; }
    public Integer getCapacity() { return capacity; }
    public BigDecimal getHourlyPrice() { return hourlyPrice; }
    public Boolean getActive() { return active; }
    public Address getAddress() { return address; }
}