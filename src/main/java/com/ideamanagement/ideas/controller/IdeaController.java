package com.ideamanagement.ideas.controller;


//@RestController
//@RequestMapping("/v1/idea")
public class IdeaController {
/*
    @Autowired
    private DbService service;
    @Autowired
    private IdeaMapper ideaMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getIdeas")
    public List<NotificationDto> getIdeas() {
        return new ArrayList<>();
    }*/
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
