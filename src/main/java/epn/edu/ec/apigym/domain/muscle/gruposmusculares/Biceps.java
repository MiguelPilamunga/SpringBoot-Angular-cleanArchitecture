package epn.edu.ec.apigym.domain.muscle.gruposmusculares;

import epn.edu.ec.apigym.domain.muscle.MuscleGroup;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Entity
@NoArgsConstructor
@DiscriminatorValue("BICEPS")

public class Biceps extends MuscleGroup {
    @Builder
    public Biceps(Long id, String nombre, String descricion) {
        super(id, nombre, descricion);
    }

}
