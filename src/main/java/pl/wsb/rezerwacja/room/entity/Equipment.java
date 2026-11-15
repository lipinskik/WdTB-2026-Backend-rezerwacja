package pl.wsb.rezerwacja.room.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 60)
    private String name;

    @Column(name = "category", nullable = false, length = 40)
    private String category;

    @Column(name = "quantity_total", nullable = false)
    private Integer quantityTotal;

    @Column(name = "available", nullable = false)
    private Boolean available;

    protected Equipment() {
    }

    public Equipment(String name, String category, Integer quantityTotal, Boolean available) {
        this.name = name;
        this.category = category;
        this.quantityTotal = quantityTotal;
        this.available = available;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public Integer getQuantityTotal() { return quantityTotal; }
    public Boolean getAvailable() { return available; }
}