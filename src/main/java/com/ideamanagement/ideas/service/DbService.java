package com.ideamanagement.ideas.service;

import com.ideamanagement.ideas.domain.IdeaExpert;
import com.ideamanagement.ideas.repository.IdeaExpertDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    @Autowired
    private IdeaExpertDao ideaExpertDao;

    public List<IdeaExpert> getAllIdeas(){
        return  ideaExpertDao.findAll();
    }
}
