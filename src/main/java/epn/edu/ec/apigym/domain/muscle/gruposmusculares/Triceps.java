package epn.edu.ec.apigym.domain.muscle.gruposmusculares;

import epn.edu.ec.apigym.domain.muscle.MuscleGroup;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@DiscriminatorValue("TRICEP")
public class Triceps extends MuscleGroup {
    @Builder
    public Triceps(Long id, String nombre, String descricion) {
        super(id, nombre, descricion);
    }
}
