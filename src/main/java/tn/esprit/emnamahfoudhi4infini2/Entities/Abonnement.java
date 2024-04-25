package tn.esprit.emnamahfoudhi4infini2.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity

public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numAbon ;
    LocalDate dateDebut ;
    LocalDate dateFin ;
    Float prixAbon ;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbon ;
}
