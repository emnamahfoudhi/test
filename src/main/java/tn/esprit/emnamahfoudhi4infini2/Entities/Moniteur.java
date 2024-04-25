package tn.esprit.emnamahfoudhi4infini2.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numMoniteur ;
    String nomM ;
    String prenomM ;
    LocalDate dateRecru ;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;
}
