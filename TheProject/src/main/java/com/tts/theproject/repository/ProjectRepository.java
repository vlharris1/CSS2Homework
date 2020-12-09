package com.tts.theproject.repository;

import org.springframework.data.repository.CrudRepository;
import com.tts.theproject.domain.Project;


public interface ProjectRepository extends CrudRepository<Project, Long> {

}


