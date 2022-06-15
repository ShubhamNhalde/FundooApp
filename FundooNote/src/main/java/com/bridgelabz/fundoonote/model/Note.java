package com.bridgelabz.fundoonote.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "NoteDetails")
public class Note {
    @Id
    @GeneratedValue
    private int id;

    private String title;

    private String description;

    private Boolean isPinned = false;

    private Boolean isArchived = false;

    private Boolean isTrashed = false;

    private String colour;

    private Date reminder;

    private int userId;

    @CreationTimestamp
    private LocalDateTime createdTimeStamp;
    @UpdateTimestamp
    private LocalDateTime updateTimeStamp;


}
