package by.syberry.enterview_task.scheduler.entity;

import java.util.List;
import java.util.Objects;

public class Task {
    /**
     * Unique name of the activity
     */
    private String name;

    /**
     * A list of names of the activitiest that must be compelte in order to be able to start the current activity
     */
    private List<String> predecessors;

    /**
     * A variable to mark empty antecedent
     */
    private int label = -1;

    public Task(String name, List<String> predecessors) {
        this.name = name;
        this.predecessors = predecessors;
    }

    public String getName() {
        return name;
    }

    public List<String> getPredecessors() {
        return predecessors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPredecessors(List<String> predecessors) {
        this.predecessors = predecessors;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return name.equals(task.name) &&
                Objects.equals(predecessors, task.predecessors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, predecessors);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + getName() + '\'' +
                ", order =" + getLabel() +
                '}';
    }
}
