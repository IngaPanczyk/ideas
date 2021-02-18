package com.ideamanagement.ideas.controller;


import com.ideamanagement.ideas.domain.IdeaExpertDto;
import com.ideamanagement.ideas.domain.IdeaNotificationDto;
import com.ideamanagement.ideas.mapper.IdeaExpertMapper;
import com.ideamanagement.ideas.mapper.IdeaMapper;
import com.ideamanagement.ideas.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/idea")
public class IdeaController {

    @Autowired
    private DbService service;
    @Autowired
    private IdeaExpertMapper ideaExpertMapper;
    @Autowired
    private IdeaMapper ideaMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getExperts")
    public List<IdeaExpertDto> getExperts() {
        return ideaExpertMapper.mapToIdeaExpertDtoList(service.getAllExperts());
    }


    @RequestMapping(method = RequestMethod.GET, value = "getExpert")
    public IdeaExpertDto getExpert(@RequestParam Long id) throws IdeaNotFoundException {
        return ideaExpertMapper.mapToIdeaExpertDto(service.getExpert(id).orElseThrow(IdeaNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createExpert", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createExpert(@RequestBody IdeaExpertDto ideaExpertDto) {
        service.saveExpert(ideaExpertMapper.mapToIdeaExpert(ideaExpertDto));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteExpertByName")
    public void deleteExpertByName(@RequestParam String name) {
        service.deleteExpertByName(name);
    }

/*
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
    }*/

}
