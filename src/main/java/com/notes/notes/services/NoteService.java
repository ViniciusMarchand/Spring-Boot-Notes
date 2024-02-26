package com.notes.notes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.notes.notes.models.Note;
import com.notes.notes.repository.NoteRepository;

import jakarta.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public List<Note> getAll() {
        return noteRepository.findAll();
    }
}
