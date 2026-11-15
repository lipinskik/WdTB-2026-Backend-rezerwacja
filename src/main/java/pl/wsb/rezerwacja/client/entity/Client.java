package pl.wsb.rezerwacja.client.entity;

import jakarta.persistence.*;
import pl.wsb.rezerwacja.account.domain.UserAccount;
import pl.wsb.rezerwacja.booking.entity.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;

    @OneToMany(mappedBy = "client")
    private List<Booking> bookings = new ArrayList<>();

    protected Client() {
    }

    public Client(String fullName, String email, String phone, String companyName, LocalDate registeredOn, UserAccount userAccount) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.companyName = companyName;
        this.registeredOn = registeredOn;
        this.userAccount = userAccount;
    }

    public Long getId() { return id; }
    public String getFullName() { return fullName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getCompanyName() { return companyName; }
    public LocalDate getRegisteredOn() { return registeredOn; }
    public UserAccount getUserAccount() { return userAccount; }
    public List<Booking> getBookings() { return bookings; }
}