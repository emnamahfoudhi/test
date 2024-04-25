package tn.esprit.emnamahfoudhi4infini2.Entities;

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
//@Table(name = "T-Pistes") //pour renommer la table dans la base de donnees
public class Piste implements Serializable //garantir l integrite des donnees (mel memoire l bd serialisation wel 3akes deserialisation////
// {
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name = "idpiste")// changer le nom de la colonne dans la bd
    private Long numPiste ;
   // @Column(nullable = false)//les contraintes sur les colonnes
    private String nomPiste ;
    @Enumerated(EnumType.STRING)
    private Couleur couleur ;
    private int pente ;
    private int longeur ;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur> skieur;

}
