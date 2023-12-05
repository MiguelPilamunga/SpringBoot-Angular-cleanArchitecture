package epn.edu.ec.apigym.domain.muscle;

import java.util.ArrayList;
import java.util.List;

public class MuscleComposite implements MuscleComponent {
    private List<MuscleComponent> muscleComponents = new ArrayList<>();
    public void addLeaf(MuscleComponent leaf) {
        muscleComponents.add(leaf);
    }

    public void removeLeaf(MuscleComponent leaf) {
        muscleComponents.remove(leaf);
    }

    public void updateLeaf(MuscleComponent oldLeaf, MuscleComponent newLeaf) {
        int index = muscleComponents.indexOf(oldLeaf);
        if (index != -1) {
            muscleComponents.set(index, newLeaf);
        }
    }

    public List<MuscleComponent> getLeaves() {
        List<MuscleComponent> leaves = new ArrayList<>();
        for (MuscleComponent component : muscleComponents) {
            if (component instanceof MuscleGroup) {
                leaves.add(component);
            }
        }
        return leaves;
    }




    @Override
    public void getInfo() {
        for (MuscleComponent component : muscleComponents) {
            component.getInfo();
        }
    }

}
