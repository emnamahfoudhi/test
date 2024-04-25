package tn.esprit.emnamahfoudhi4infini2.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numCours ;
    int niveau ;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours ;
    @Enumerated(EnumType.STRING)
    Support support ;
    Float prix ;
    int creneau ;

    @JsonIgnore

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cours")
    private Set<Inscription> Inscriptions;
}
