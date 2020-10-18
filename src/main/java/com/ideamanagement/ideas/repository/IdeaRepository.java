package com.ideamanagement.ideas.repository;

import com.ideamanagement.ideas.domain.Idea;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface IdeaRepository extends CrudRepository<Idea, Long> {
    @Override
    List<Idea>findAll();
    @Override
    Idea save (Idea idea);
    @Override
    Optional<Idea>findById(Long id);

}
