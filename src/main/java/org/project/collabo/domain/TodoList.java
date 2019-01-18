package org.project.collabo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TodoList {
    @Id
    private int id;
    private int priority;
    private String title;
    private String summary;
    private String content;
    private Time dDay;
}
