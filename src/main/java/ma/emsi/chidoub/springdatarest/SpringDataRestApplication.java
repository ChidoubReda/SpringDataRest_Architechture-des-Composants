package ma.emsi.chidoub.springdatarest;

import ma.emsi.chidoub.springdatarest.enums.Genre;
import ma.emsi.chidoub.springdatarest.model.Etudiant;
import ma.emsi.chidoub.springdatarest.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication implements CommandLineRunner {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public void run(String... args) throws Exception {
        Etudiant etudiant1 = Etudiant.builder()
                .nom("Chidoub")
                .prenom("Youssef")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(etudiant1);
        Etudiant etudiant2 = Etudiant.builder()
                .nom("Rami")
                .prenom("Haroun")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(etudiant2);
        Etudiant etudiant3 = Etudiant.builder()
                .nom("Laarach")
                .prenom("Salma")
                .genre(Genre.Femme)
                .build();
        etudiantRepository.save(etudiant3);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);
    }

}
