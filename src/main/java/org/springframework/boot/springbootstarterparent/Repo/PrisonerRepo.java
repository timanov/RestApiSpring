package org.springframework.boot.springbootstarterparent.Repo;

import org.springframework.boot.springbootstarterparent.Entities.Prisoner;
import org.springframework.data.repository.CrudRepository;

public interface PrisonerRepo extends CrudRepository<Prisoner, Integer> {
}
