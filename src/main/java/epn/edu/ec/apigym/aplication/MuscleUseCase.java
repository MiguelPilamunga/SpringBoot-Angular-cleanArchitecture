package epn.edu.ec.apigym.aplication;

import epn.edu.ec.apigym.domain.muscle.MuscleGroup;
import epn.edu.ec.apigym.domain.muscle.gruposmusculares.*;
import epn.edu.ec.apigym.infrastructure.inputport.MuscleInput;
import epn.edu.ec.apigym.infrastructure.outport.MuscleJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class MuscleUseCase  implements MuscleInput {

    @Autowired
    MuscleJPA muscleJPA;

    @Override
    public MuscleGroup saveMuscle(String nombre, String descripcion){

        return muscleJPA.save(Pecho.builder()
                        .nombre(nombre)
                        .descricion(descripcion)
                .build());
    }
    @Override
    public  List<MuscleGroup> getAllMuscles(){
        return muscleJPA.findAll()
                .stream().filter(Pecho.class::isInstance)
                .map(Pecho.class::cast)
                .collect(Collectors.toList());
    }



    @Override
    public Optional<MuscleGroup> getMuscleGroup(Long id){
        return muscleJPA.findById(id);
    }

    @Override
    public MuscleGroup createMuscleGroup(MuscleGroup muscleGroup) {
        return muscleJPA.save(muscleGroup);
    }


}
