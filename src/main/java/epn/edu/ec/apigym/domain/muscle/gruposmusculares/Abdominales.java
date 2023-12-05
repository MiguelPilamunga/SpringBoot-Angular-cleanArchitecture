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
@DiscriminatorValue("ABDOMEN")

public class Abdominales extends MuscleGroup {
    @Builder
    public Abdominales(Long id, String nombre, String descricion) {
        super(id, nombre, descricion);
    }

}
