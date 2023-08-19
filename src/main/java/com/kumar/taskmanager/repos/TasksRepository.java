package com.kumar.taskmanager.repos;

import com.kumar.taskmanager.entities.TaskEntity;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TasksRepository extends JpaRepository<TaskEntity, Integer> {
    List<TaskEntity> findAllByCompleted(boolean completed);

    List<TaskEntity> findAllByCompletedAndDueDateBefore(boolean completed, Date dueDate);

    List<TaskEntity> findAllByTitleContainingIgnoreCase(String titleFragment);
}
