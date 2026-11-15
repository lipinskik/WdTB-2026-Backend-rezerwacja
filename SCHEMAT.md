# Schemat bazy danych

Plik generują reguły projektu (panel Maven → Lifecycle → verify). Nie edytujcie go ręcznie.

Tabele: 6 (w tym tabele łączące @ManyToMany: room_equipment) · kolumny: 33 · relacje: 2 × @ManyToOne, 2 × @OneToMany, 1 × @OneToOne, 1 × @ManyToMany

| Tabela | Encja | Kolumny | Klucze obce |
|---|---|---|---|
| booking | Booking | 7 | client_id, room_id |
| client | Client | 7 | user_account_id |
| equipment | Equipment | 5 | — |
| room | Room | 9 | — |
| user_account | UserAccount | 5 | — |

```mermaid
erDiagram
    booking {
        Long id PK
        Long client_id FK
        Boolean confirmed
        LocalDateTime end_time
        Long room_id FK
        LocalDateTime start_time
        BigDecimal total_price
    }
    client {
        Long id PK
        String company_name
        String email
        String full_name
        String phone
        LocalDate registered_on
        Long user_account_id FK
    }
    equipment {
        Long id PK
        Boolean available
        String category
        String name
        Integer quantity_total
    }
    room {
        Long id PK
        Boolean active
        Integer capacity
        String city
        BigDecimal hourly_price
        String name
        String postal_code
        RoomType room_type
        String street
    }
    user_account {
        Long id PK
        LocalDateTime created_at
        String display_name
        String email
        AccountRole role
    }
    client ||--o{ booking : "client_id"
    room ||--o{ booking : "room_id"
    room }o--o{ equipment : "room_equipment"
    user_account |o--o| client : "user_account_id"
```
