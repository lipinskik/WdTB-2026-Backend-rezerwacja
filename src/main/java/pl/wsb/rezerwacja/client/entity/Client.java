package pl.wsb.rezerwacja.client.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 80)
    private String fullName;

    @Column(name = "email", nullable = false, unique = true, length = 120)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "company_name", length = 100)
    private String companyName;

    @Column(name = "registered_on", nullable = false)
    private LocalDate registeredOn;

    protected Client() {
    }

    public Client(String fullName, String email, String phone, String companyName, LocalDate registeredOn) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.companyName = companyName;
        this.registeredOn = registeredOn;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public LocalDate getRegisteredOn() {
        return registeredOn;
    }
}