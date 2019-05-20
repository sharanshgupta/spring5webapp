package com.example.spring5webapp.Model.Repositories;

import com.example.spring5webapp.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
