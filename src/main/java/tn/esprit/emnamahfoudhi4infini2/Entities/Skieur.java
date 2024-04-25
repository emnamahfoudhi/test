package tn.esprit.emnamahfoudhi4infini2.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pour avoir une autoincrementation sur les id
     Long numSkieur ;
     String nomS ;
     String prenomS ;
     LocalDate dateNaissance ;
    //@TRansient tkhabi el attribut fe base de donnees
     String ville ;
//pour supprimer l abonnement et le skieur en meme temps h et l ajout de meme
    @JsonIgnore
     @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Abonnement abonnement;
@JsonIgnore
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "skieur" , fetch = FetchType.EAGER )//fel les associations eli fehom many aandy mochkla mtaa lazy collections nobligeha bel fetch bech twali eager
    private Set<Inscription> Inscriptions;
@JsonIgnore
     @ManyToMany(mappedBy = "skieur", cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private Set<Piste> pistes;


//fetch nestaamelha kif nheb naccedi l des informations todkhel fehom relation many to many wala one to many(one to one w many to one le)par exemple bech naffichi skieur b kolou bech tjini mochklet lazy bech yaffichili les abonnements mteeou donc nestaamel fetch eager
}
