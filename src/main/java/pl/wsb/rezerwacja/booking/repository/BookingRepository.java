package pl.wsb.rezerwacja.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wsb.rezerwacja.booking.entity.Booking;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByRoom_Name(String roomName);

    List<Booking> findByClient_Email(String email);
}