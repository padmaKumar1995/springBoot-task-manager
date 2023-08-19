package com.kumar.taskmanager.services;

import com.kumar.taskmanager.repos.NotesRepository;
import com.kumar.taskmanager.repos.TasksRepository;
import org.springframework.stereotype.Service;

@Service
public class TasksService {
    private final TasksRepository tasksRepository;
    private final NotesRepository notesRepository;

    public TasksService(TasksRepository tasksRepository, NotesRepository notesRepository) {
        this.tasksRepository = tasksRepository;
        this.notesRepository = notesRepository;
    }
}
