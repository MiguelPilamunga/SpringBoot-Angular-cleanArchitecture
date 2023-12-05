package epn.edu.ec.apigym.domain.muscle.gruposmusculares;

import epn.edu.ec.apigym.domain.muscle.MuscleGroup;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@NoArgsConstructor
@DiscriminatorValue("PECHO")
public class Pecho extends MuscleGroup {
    @Builder
    public Pecho(Long id, String nombre, String descricion) {
        super(id, nombre, descricion);
    }
}
