package com.ideamanagement.ideas.repository;

import com.ideamanagement.ideas.domain.IdeaExpert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface IdeaExpertDao extends CrudRepository<IdeaExpert, Long> {
    @Override
    List<IdeaExpert> findAll();

    @Override
    Optional<IdeaExpert>findById(Long id);

    @Override
    IdeaExpert save(IdeaExpert ideaExpert);

    @Override
    long count();

}
