package ma.emsi.chidoub.springdatarest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.chidoub.springdatarest.enums.Genre;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name="Student")
@Builder
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="nomEt",nullable = false)
    private String nom;
    @Column(name="prenomEt",nullable = false)
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @ManyToOne
    @JoinColumn(name = "id_centre")
    private Centre id_centre;
}
