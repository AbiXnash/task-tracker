package in.abx.tasktracker.handler;

import java.time.LocalDate;

import in.abx.tasktracker.entity.Tasks;
import in.abx.tasktracker.enums.TaskStatus;
import in.abx.tasktracker.utils.IdGenerator;
import lombok.extern.java.Log;

@Log
public class AddTaskHander {

    public void create(String description) {
        Tasks newTask = Tasks.builder().description(description).id(IdGenerator.generateId()).createdAt(LocalDate.now())
                .updatedAt(LocalDate.now()).status(TaskStatus.TODO).build();

        log.info(newTask.toString());
    }
}
