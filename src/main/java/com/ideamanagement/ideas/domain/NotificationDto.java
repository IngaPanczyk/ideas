package com.ideamanagement.ideas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class NotificationDto {
    private Long id;
    private String subject;
    private String description;
    private LocalDate reportingDate;
    private Status status;
    private IdeaExpert ideaExpert;
    private User user;

}
