package by.syberry.enterview_task.scheduler.logic;

import by.syberry.enterview_task.scheduler.entity.Task;

import java.util.Comparator;
import java.util.List;

public class Scheduler implements IScheduler {
    @Override
    public List<Task> schedule(List<Task> tasks) {

        int order = topologicalSort(tasks);

        if (order < 0) {
            System.out.println("Information is incorrect! There is not a point to start! ");
        } else if (order != tasks.size()) {
            System.out.println("Information is incorrect! The list has depend! ");
        } else {
            tasks.sort(new Comparator<Task>() {
                @Override
                public int compare(Task x, Task y) {
                    return Integer.compare(x.getLabel(), y.getLabel());
                }
            });
        }

        return tasks;
    }

    private int topologicalSort(List<Task> tasks) {
        int l = 0;
        Task task;

        while (findEmptyNoLabelTask(tasks) != null) {
            l++;
            task = findEmptyNoLabelTask(tasks);
            task.setLabel(l);

            for (Task t : tasks) {
                t.getPredecessors().remove(task.getName());
            }
        }
        return l;
    }

    private Task findEmptyNoLabelTask(List<Task> tasks) {
        for (Task t : tasks) {
            if (t.getPredecessors().size() == 0 && t.getLabel() == -1) {
                return t;
            }
        }
        return null;
    }

}
