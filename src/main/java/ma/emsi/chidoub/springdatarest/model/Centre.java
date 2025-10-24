package ma.emsi.chidoub.springdatarest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Centre")
public class Centre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom_centre", nullable = false)
    private String nom_centre;

    @Column(name = "adresse", nullable = false)
    private String adresse;

    @OneToMany(mappedBy = "id_centre", cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;
}