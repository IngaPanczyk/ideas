package com.ideamanagement.ideas.controller;


import com.ideamanagement.ideas.domain.IdeaDto;
import com.ideamanagement.ideas.mapper.IdeaMapper;
import com.ideamanagement.ideas.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController//przemienia zwykłe POJO kontroler
@RequestMapping("/v1/idea") //v1 oznacza wersję aplikacjia
public class IdeaController {

    @Autowired
    private DbService service;
    @Autowired
    private IdeaMapper ideaMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getIdeas")
    public List<IdeaDto> getIdeas() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getIdea")
    public IdeaDto getIdes(@RequestParam Long id) throws IdeaNotFoundException {
        return ideaMapper.mapToIdeaDto(service.getIdea(id).orElseThrow(IdeaNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateIdea")
    public IdeaDto updateIdes(@RequestBody IdeaDto ideaDto) {
        return ideaMapper.mapToIdeaDto((service.saveIdea(ideaMapper.mapToIdea(ideaDto))));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteIdea")
    public void deleteIdea(long id) {
    }

    @RequestMapping(method = RequestMethod.POST, value = "createIdea", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createIdea(@RequestBody IdeaDto ideaDto) {
        service.saveIdea(ideaMapper.mapToIdea(ideaDto));
    }


}
