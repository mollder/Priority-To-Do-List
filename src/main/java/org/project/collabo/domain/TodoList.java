package org.project.collabo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int priority;
    private String title;
    private String summary;
    private String content;
    private LocalDateTime dDay;

    public TodoList(int priority, String title, String summary, String content, LocalDateTime dDay) {
        this.priority = priority;
        this.title = title;
        this.summary = summary;
        this.content= content;
        this.dDay = dDay;
    }


}
