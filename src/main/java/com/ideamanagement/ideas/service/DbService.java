package com.ideamanagement.ideas.service;

import com.ideamanagement.ideas.domain.Idea;
import com.ideamanagement.ideas.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private IdeaRepository repository;

    public List<Idea> getAllIdeas(){
        return repository.findAll();
    }

    public Idea saveIdea(final Idea task) {
        return repository.save(task);
    }

    public Optional<Idea> getIdea(final Long id) {
        return repository.findById(id);
    }

    public void deleteIdea(final Long id) {
        repository.deleteById(id);
    }
}
