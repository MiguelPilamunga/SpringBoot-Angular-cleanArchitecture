package epn.edu.ec.apigym.domain.muscle.gruposmusculares;

import epn.edu.ec.apigym.domain.muscle.MuscleGroup;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@NoArgsConstructor
@DiscriminatorValue("PIERNA")

public class Piernas extends MuscleGroup {
    @Builder
    public Piernas(Long id, String nombre, String descricion) {
        super(id, nombre, descricion);
    }
}