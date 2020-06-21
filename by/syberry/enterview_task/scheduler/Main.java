package by.syberry.enterview_task.scheduler;

import by.syberry.enterview_task.scheduler.logic.IScheduler;
import by.syberry.enterview_task.scheduler.entity.Task;
import by.syberry.enterview_task.scheduler.logic.Scheduler;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /**
         * The following is the example of how the scheduler may be used
         */
        List<Task> tasks = Arrays.asList(
//                new Task("E", new LinkedList<>(Arrays.asList("B"))),
//                new Task("D", new LinkedList<>(Arrays.asList("A", "B"))),
//                new Task("A", new LinkedList<>(Arrays.asList())),
//                new Task("B", new LinkedList<>(Arrays.asList("A"))),
//                new Task("C", new LinkedList<>(Arrays.asList("D", "B"))),
//                new Task("F", new LinkedList<>(Arrays.asList("E")))

/**
 * Incorrect data to show validation 2
 */
                new Task("E", new LinkedList<>(Arrays.asList())),
                new Task("D", new LinkedList<>(Arrays.asList("A", "B", "C", "E", "F"))),
                new Task("A", new LinkedList<>(Arrays.asList("B", "C", "D", "E", "F"))),
                new Task("B", new LinkedList<>(Arrays.asList("A", "C", "E", "F"))),
                new Task("C", new LinkedList<>(Arrays.asList("A", "B", "D", "E"))),
                new Task("F", new LinkedList<>(Arrays.asList("A", "B", "D", "E")))

/**
 * Incorrect data to show validation 1
 */

//                new Task("E", Arrays.asList("A", "B", "C", "F")),
//                new Task("D", Arrays.asList("A", "B", "C", "E", "F")),
//                new Task("A", Arrays.asList("B", "C", "D", "E", "F")),
//                new Task("B", Arrays.asList("A", "C", "E", "F")),
//                new Task("C", Arrays.asList("A", "B", "D", "E")),
//                new Task("F", Arrays.asList("A", "B", "D", "E"))
        );


        IScheduler scheduler = new Scheduler();
        List<Task> sortedTasks = scheduler.schedule(tasks);
        for (Task t : sortedTasks) {
            System.out.println(t);
        }

    }
}
