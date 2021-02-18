package com.ideamanagement.ideas.service;

import com.ideamanagement.ideas.domain.IdeaExpert;
import com.ideamanagement.ideas.domain.IdeaNotification;
import com.ideamanagement.ideas.repository.IdeaExpertDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private IdeaExpertDao ideaExpertDao;

    public List<IdeaExpert> getAllExperts() {
        return ideaExpertDao.findAll();
    }

    public Optional<IdeaExpert> getExpert(final Long id) {
        return ideaExpertDao.findById(id);
    }

    public IdeaExpert saveExpert(final IdeaExpert ideaExpert){
        return ideaExpertDao.save(ideaExpert);
    }

    public void deleteExpertByName(final String expertName){
        ideaExpertDao.deleteByExpertName(expertName);
    }

}
