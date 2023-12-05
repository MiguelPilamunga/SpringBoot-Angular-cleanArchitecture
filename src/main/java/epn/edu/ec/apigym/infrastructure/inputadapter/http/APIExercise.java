package epn.edu.ec.apigym.infrastructure.inputadapter.http;

import epn.edu.ec.apigym.domain.Exercise;
import epn.edu.ec.apigym.infrastructure.inputadapter.dto.ExercisesDTO;
import epn.edu.ec.apigym.infrastructure.inputport.ExercisesInput;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//acesso al admin
@RestController
@RequestMapping("/exercise")
public class APIExercise {

    @Autowired
    ExercisesInput exercisesInput;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Exercise> getAll(){
        return exercisesInput.getAllExercises();
    }



    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    
    public Exercise saveExercise(@RequestBody ExercisesDTO exercisesDTO) {
        return exercisesInput.saveExercise(
                exercisesDTO.getName(),
                exercisesDTO.getDescription(),
                exercisesDTO.getDifficulty(),
                exercisesDTO.getMuscleGroupId());
    }
    @PostMapping(value = "add", produces = MediaType.APPLICATION_JSON_VALUE)
    public void asignar(@RequestParam("idM") Long idM,@RequestParam("idE") Long idE){
        System.out.println(idM+" "+idE);
    }

    @DeleteMapping("/{id}")
    public boolean deleteExercise(@PathVariable("id") Long id) {
    
    return true;  
}

}
