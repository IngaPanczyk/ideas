package com.ideamanagement.ideas.mapper;

import com.ideamanagement.ideas.domain.Notification;
import com.ideamanagement.ideas.domain.NotificationDto;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.stream.Collectors;
@Component
public class IdeaMapper {
    public Notification mapToIdea (final NotificationDto notificationDto){
        return new Notification(
                notificationDto.getId(),
                notificationDto.getSubject(),
                notificationDto.getDescription(),
                notificationDto.getReportingDate(),
                notificationDto.getStatus(),
                notificationDto.getIdeaExpert(),
                notificationDto.getUser()
        );
    }
  /*  public NotificationDto mapToIdeaDto (final Notification idea){
        return new NotificationDto(
                idea.getId(),
                idea.getSubject(),
                idea.getDescription(),
                idea.getStatus()
        );
    }
    public List<NotificationDto> mapToIdeaDtoList (final  List<Notification> ideaList){
        return ideaList.stream()
                .map(t-> new NotificationDto(t.getId(), t.getSubject(), t.getDescription(), t.getStatus()))
                .collect(Collectors.toList());
    }*/
}
