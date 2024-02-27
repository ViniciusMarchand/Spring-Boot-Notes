package com.notes.notes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.notes.notes.models.Note;
import com.notes.notes.repository.NoteRepository;



@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public List<Note> getAll() {
        return noteRepository.findAll();
    }


    
}
