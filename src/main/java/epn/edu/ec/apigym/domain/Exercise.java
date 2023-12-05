package epn.edu.ec.apigym.domain;

import epn.edu.ec.apigym.domain.muscle.MuscleGroup;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "exercise")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", length = 255)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "difficulty", length = 10)
    private DifficultyType difficulty;

    @Column(name = "name", length = 100)
    private String name;

    @ManyToOne
    private MuscleGroup muscleGroup;

    public enum DifficultyType {
        EASY, HARD, MEDIUM
    }

}
