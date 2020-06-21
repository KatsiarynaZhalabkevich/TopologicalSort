package by.syberry.enterview_task.scheduler.logic;

import by.syberry.enterview_task.scheduler.entity.Task;

import java.util.List;

public interface IScheduler {

    List<Task> schedule(List<Task> tasks);
}
