package epn.edu.ec.apigym.infrastructure.inputport;

import epn.edu.ec.apigym.domain.Exercise;

import java.util.List;

public interface ExercisesInput {
    List<Exercise> getAllExercises();

    Exercise saveExercise(String name, String description, String difficulty, Long muscleGroupId);

    boolean deleteExercise(Long id);

}

