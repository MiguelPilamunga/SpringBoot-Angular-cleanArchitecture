package epn.edu.ec.apigym.infrastructure.outport;

import epn.edu.ec.apigym.domain.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseJPA extends JpaRepository<Exercise ,Long> {
}
