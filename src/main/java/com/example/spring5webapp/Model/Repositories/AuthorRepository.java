package com.example.spring5webapp.Model.Repositories;

import com.example.spring5webapp.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
