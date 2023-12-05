package epn.edu.ec.apigym.aplication;

import epn.edu.ec.apigym.domain.Exercise;
import epn.edu.ec.apigym.infrastructure.inputport.ExercisesInput;
import epn.edu.ec.apigym.infrastructure.inputport.MuscleInput;
import epn.edu.ec.apigym.infrastructure.outport.ExerciseJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExerciseUseCase implements ExercisesInput {

    @Autowired
    ExerciseJPA exerciseJPA;
    @Autowired
    MuscleInput muscleInput;

    @Override
    public List<Exercise> getAllExercises() {
        return exerciseJPA.findAll();
    }

    @Override
    public Exercise saveExercise(String name, String description, String difficulty, Long muscleGroupId) {
        return exerciseJPA.save(Exercise.builder()
                .name(name)
                .description(description)
                .difficulty(difficulty.equals("EASY") ? Exercise.DifficultyType.EASY : Exercise.DifficultyType.HARD)
                .muscleGroup(muscleInput.getMuscleGroup(muscleGroupId).get())
                .build());
    }

    public void saveMuscleinExercise(String nombre, String descrpcion, Exercise.DifficultyType diff , Long idMuscle){
        if (muscleInput.getMuscleGroup(idMuscle).isPresent()){
            exerciseJPA.save(
                    Exercise.builder()
                            .description(descrpcion)
                            .difficulty(diff)
                            .name(nombre)
                            .muscleGroup(muscleInput.getMuscleGroup(idMuscle).get())
                            .build()
            );
        }
    }

    @Override
    public boolean deleteExercise(Long id) {
    Exercise exerciseToDelete = exerciseJPA.findById(id).orElse(null); // Use .orElse(null) to handle the case where the exercise might not exist
        if (exerciseToDelete != null) {
            exerciseJPA.delete(exerciseToDelete);
            return true; // Deletion was successful
         }

            return false; // Exercise with the given ID was not found
        }

}
