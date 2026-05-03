package in.abx.tasktracker.entity;

import in.abx.tasktracker.enums.TaskStatus;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tasks {

    private Long id;
    private String description;
    private TaskStatus status;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
