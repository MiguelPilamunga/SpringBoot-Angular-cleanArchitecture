package epn.edu.ec.apigym.infrastructure.inputadapter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class ExercisesDTO {

    private String description;
    private String difficulty;
    private String name;
    private Long muscleGroupId;

}
