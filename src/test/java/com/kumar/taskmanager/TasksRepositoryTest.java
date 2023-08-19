package com.kumar.taskmanager;

import com.kumar.taskmanager.entities.TaskEntity;
import com.kumar.taskmanager.repos.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class TasksRepositoryTest {
    @Autowired
    TasksRepository tasksRepository;

    @Test
    void shouldCreateTask() {
        TaskEntity task = new TaskEntity();
        task.setTitle("Test task");
        task.setDesc("Test task");
        task.setCompleted(true);
        var savedTask = tasksRepository.save(task);
        assertNotNull(savedTask);
    }
}
