package com.example.help_desk.repositories;

import com.example.help_desk.model.InLineEmployee;
import com.example.help_desk.model.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins ="*")
@RepositoryRestResource(excerptProjection = InLineEmployee.class)
public interface SupportRepository extends JpaRepository<Support, Long> {
}
