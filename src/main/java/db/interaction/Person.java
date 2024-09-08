package db.interaction;

import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
@Table
public class Person {

    public Person(String name, String surname, LocalDate birthdate) {
        this.name=name;
        this.surname=surname;
        this.birthdate=birthdate;
    }
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="Name")
    private String name;
    @Column(name ="Surname")
    private String surname;
    @Column(name ="Birtdate")
    private LocalDate birthdate;

}
