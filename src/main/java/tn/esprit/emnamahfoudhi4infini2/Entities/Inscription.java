package tn.esprit.emnamahfoudhi4infini2.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numInscription ;
    int numSemaine ;
    @JsonIgnore
    @ManyToOne
    Skieur skieur;
    @JsonIgnore
    @ManyToOne
    Cours cours;
}
