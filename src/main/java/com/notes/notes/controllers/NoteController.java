package com.notes.notes.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.notes.notes.models.Note;
import com.notes.notes.services.NoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RestController
@RequestMapping("/note")


public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping
    public ResponseEntity<List<Note>> getAll() {
        List<Note> notes = noteService.getAll();
        return ResponseEntity.ok().body(notes);
    }
}
