package pl.wsb.rezerwacja.room.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Embeddable
public class Address {

    @Column(name = "street", nullable = false, length = 80)
    private String street;

    @Column(name = "city", nullable = false, length = 40)
    private String city;

    @Column(name = "postal_code", nullable = false, length = 6)
    private String postalCode;

    protected Address() {
    }

    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getPostalCode() { return postalCode; }
}
