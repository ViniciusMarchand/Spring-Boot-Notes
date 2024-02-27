package com.notes.notes.DTO;

import java.sql.Timestamp;

public record NoteDTO (String title, Timestamp timestamp, String color, String description) {
    
}
