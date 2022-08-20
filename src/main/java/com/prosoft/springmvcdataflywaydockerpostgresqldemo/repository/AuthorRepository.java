package com.prosoft.springmvcdataflywaydockerpostgresqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.prosoft.springmvcdataflywaydockerpostgresqldemo.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>, CrudRepository<Author, Long> {

    Author findAuthorById(long id);

}
