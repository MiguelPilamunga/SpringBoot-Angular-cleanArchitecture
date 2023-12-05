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
@DiscriminatorValue("HOMBRO")

public class Hombros extends MuscleGroup {
    @Builder
    public Hombros(Long id, String nombre, String descricion) {
        super(id, nombre, descricion);
    }

}