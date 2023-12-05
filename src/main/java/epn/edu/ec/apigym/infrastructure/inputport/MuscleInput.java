package epn.edu.ec.apigym.infrastructure.inputport;

import epn.edu.ec.apigym.domain.muscle.MuscleGroup;

import java.util.List;
import java.util.Optional;

public interface MuscleInput {



    MuscleGroup saveMuscle(String nombre,String descripcion);

    List<MuscleGroup> getAllMuscles();


    Optional<MuscleGroup> getMuscleGroup(Long id);

    MuscleGroup createMuscleGroup(MuscleGroup muscleGroup);
}
