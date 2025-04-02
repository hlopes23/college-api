package enttity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name = "Teachers")
@Table
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String age;
    @Column
    private Date birthdate;
    @Column
    private String gender;
    @Column(unique = true)
    private String email;
    @Column
    private boolean active;
    //@ManyToMany(mappedBy = "account")

}

