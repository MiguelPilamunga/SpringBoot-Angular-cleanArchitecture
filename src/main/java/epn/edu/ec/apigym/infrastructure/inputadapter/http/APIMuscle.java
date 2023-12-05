package epn.edu.ec.apigym.infrastructure.inputadapter.http;

import epn.edu.ec.apigym.domain.muscle.MuscleGroup;
import epn.edu.ec.apigym.domain.muscle.gruposmusculares.Pecho;
import epn.edu.ec.apigym.infrastructure.inputadapter.dto.MusculoDTO;
import epn.edu.ec.apigym.infrastructure.inputport.MuscleInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/muscle")
public class APIMuscle {

    @Autowired
    MuscleInput muscleInput;
    @GetMapping()
    public List<MuscleGroup> getAllMuscles(){
        return muscleInput.getAllMuscles();
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public MuscleGroup saveMuscle(@RequestBody MusculoDTO MusculoDTO){
        return muscleInput.saveMuscle(MusculoDTO.getNombre(),MusculoDTO.getDescripcion());
    }
}
