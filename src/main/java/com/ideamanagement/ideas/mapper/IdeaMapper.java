package com.ideamanagement.ideas.mapper;

import com.ideamanagement.ideas.domain.Idea;
import com.ideamanagement.ideas.domain.IdeaDto;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.stream.Collectors;
@Component
public class IdeaMapper {
    public Idea mapToIdea (final IdeaDto ideaDto){
        return new Idea(
                ideaDto.getId(),
                ideaDto.getSubject(),
                ideaDto.getDescription(),
                ideaDto.getStatus()
        );
    }
    public IdeaDto mapToIdeaDto (final Idea idea){
        return new IdeaDto(
                idea.getId(),
                idea.getSubject(),
                idea.getDescription(),
                idea.getStatus()
        );
    }
    public List<IdeaDto> mapToIdeaDtoList (final  List<Idea> ideaList){
        return ideaList.stream()
                .map(t-> new IdeaDto(t.getId(), t.getSubject(), t.getDescription(), t.getStatus()))
                .collect(Collectors.toList());
    }
}
