package com.ideamanagement.ideas.mapper;

import com.ideamanagement.ideas.domain.IdeaExpert;
import com.ideamanagement.ideas.domain.IdeaExpertDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class IdeaExpertMapper {
    public IdeaExpert mapToIdeaExpert( final IdeaExpertDto ideaExpertDto){
        return new IdeaExpert(
                ideaExpertDto.getExpertId(),
                ideaExpertDto.getExpertName(),
                ideaExpertDto.getIdeaNotificationList()
        );
    }

    public IdeaExpertDto mapToIdeaExpertDto( final IdeaExpert ideaExpert){
        return new IdeaExpertDto(
                ideaExpert.getExpertId(),
                ideaExpert.getExpertName(),
                ideaExpert.getIdeaNotificationList()
        );
    }
    public List<IdeaExpertDto> mapToIdeaExpertDtoList( final List<IdeaExpert> ideaExpertList){
        return ideaExpertList.stream()
        .map(t->new IdeaExpertDto(t.getExpertId(),t.getExpertName(),t.getIdeaNotificationList()))
        .collect(Collectors.toList());
    }
}
