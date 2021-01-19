package com.ideamanagement.ideas.controller;


import com.ideamanagement.ideas.domain.IdeaExpertDto;
import com.ideamanagement.ideas.domain.IdeaNotificationDto;
import com.ideamanagement.ideas.mapper.IdeaExpertMapper;
import com.ideamanagement.ideas.mapper.IdeaMapper;
import com.ideamanagement.ideas.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/idea")
public class IdeaController {

    @Autowired
    private DbService service;
    @Autowired
    private IdeaExpertMapper ideaExpertMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getIdeas")
    public List<IdeaExpertDto> getIdeas() {
        return ideaExpertMapper.mapToIdeaExpertDtoList(service.getAllIdeas());
    }
/*

    @RequestMapping(method = RequestMethod.GET, value = "getIdea")
    public NotificationDto getIdes(@RequestParam Long id) throws IdeaNotFoundException {
        return ideaMapper.mapToIdeaDto(service.getIdea(id).orElseThrow(IdeaNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateIdea")
    public IdeaDto updateIdes(@RequestBody NotificationDto ideaDto) {
        return ideaMapper.mapToIdeaDto((service.saveIdea(ideaMapper.mapToIdea(ideaDto))));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteIdea")
    public void deleteIdea(long id) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "createIdea", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createIdea(@RequestBody IdeaDto ideaDto) {
        service.saveIdea(ideaMapper.mapToIdea(ideaDto));
    }

*/

}
