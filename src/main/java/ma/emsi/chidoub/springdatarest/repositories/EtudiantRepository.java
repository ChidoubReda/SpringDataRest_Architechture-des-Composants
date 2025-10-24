package ma.emsi.chidoub.springdatarest.repositories;

import ma.emsi.chidoub.springdatarest.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(path="eleves")//rename the name of the class in the path
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    public List<Etudiant> findEtudiantByNom(@Param("nom") String nom);
}
