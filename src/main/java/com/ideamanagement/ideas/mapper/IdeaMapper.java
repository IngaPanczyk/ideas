package com.ideamanagement.ideas.mapper;

import com.ideamanagement.ideas.domain.IdeaNotification;
import com.ideamanagement.ideas.domain.IdeaNotificationDto;
import org.springframework.stereotype.Component;

@Component
public class IdeaMapper {
    public IdeaNotification mapToIdea (final IdeaNotificationDto ideaNotificationDto){
        return new IdeaNotification(
                ideaNotificationDto.getId(),
                ideaNotificationDto.getSubject(),
                ideaNotificationDto.getDescription(),
                ideaNotificationDto.getReportingDate(),
                ideaNotificationDto.getStatus(),
                ideaNotificationDto.getIdeaExpert(),
                ideaNotificationDto.getUser()
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
