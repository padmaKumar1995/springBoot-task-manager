package com.kumar.taskmanager.repos;

import com.kumar.taskmanager.entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<NoteEntity, Integer> {
}
