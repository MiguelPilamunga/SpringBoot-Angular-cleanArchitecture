package epn.edu.ec.apigym.infrastructure.outport;

import epn.edu.ec.apigym.domain.muscle.MuscleGroup;
import epn.edu.ec.apigym.domain.muscle.gruposmusculares.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MuscleJPA extends JpaRepository<MuscleGroup,Long> {

    @Query("SELECT p FROM Pecho p")
    List<MuscleGroup> findAllPecho();


    @Query("SELECT a FROM Abdominales a")
    List<Abdominales> findAllAbdominales();

    @Query("SELECT b FROM Biceps b")
    List<Biceps> findAllBiceps();

    @Query("SELECT e FROM Espalda e")
    List<Espalda> findAllEspalda();

    @Query("SELECT h FROM Hombros h")
    List<Hombros> findAllHombros();

    @Query("SELECT pi FROM Piernas pi")
    List<Piernas> findAllPiernas();

    @Query("SELECT t FROM Triceps t")
    List<Triceps> findAllTriceps();

}
