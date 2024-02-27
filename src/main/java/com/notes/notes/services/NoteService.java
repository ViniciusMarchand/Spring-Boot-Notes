package com.notes.notes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.notes.notes.DTO.NoteDTO;
import com.notes.notes.models.Note;
import com.notes.notes.repository.NoteRepository;
import com.notes.notes.services.interfaces.CrudService;

import jakarta.annotation.Nonnull;
import jakarta.persistence.EntityNotFoundException;



@Service
public class NoteService implements CrudService<Note, NoteDTO>{

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<Note> getAll() {
        return noteRepository.findAll();
    }

    @Override
    public Note getById(int id) {
        return noteRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Nota inexistente."));
    }

    @Override
    public Note save(NoteDTO noteDTO) {
        Note note = new Note();

        note.setTitle(noteDTO.title());
        note.setTimestamp(noteDTO.timestamp());
        note.setColor(noteDTO.color());
        note.setDescription(noteDTO.description());

        return noteRepository.save(note);
    }

    @Override
    public Note update(int id, NoteDTO noteDTO) {        
        Note note = getById(id);


        note.setTitle(noteDTO.title());
        note.setTimestamp(noteDTO.timestamp());
        note.setColor(noteDTO.color());
        note.setDescription(noteDTO.description());

        return noteRepository.save(note);

    }

    @Override
    public boolean delete(int id) {
        return false;
    }


    
}
