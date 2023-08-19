package com.kumar.taskmanager.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name = "tasks")
public class TaskEntity extends BaseEntity {
    @Column(name = "title", nullable = false, length = 150)
    String title;
    @Column(name = "desc", nullable = true, length = 500)
    String desc;
    @Column(name = "completed", nullable = false, columnDefinition = "boolean default false")
    Boolean completed = false;
    @Column(name = "due_date", nullable = true)
    Date dueDate;

    /*//this mapping is needed only when we need notes also to be loaded whenever we load task
    @OneToMany(mappedBy = "task", fetch = FetchType.EAGER)
    List<NoteEntity> notes;*/
}
