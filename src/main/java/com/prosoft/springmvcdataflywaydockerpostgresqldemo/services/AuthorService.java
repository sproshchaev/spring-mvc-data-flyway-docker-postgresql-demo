package com.prosoft.springmvcdataflywaydockerpostgresqldemo.services;

import com.prosoft.springmvcdataflywaydockerpostgresqldemo.repository.AuthorRepository;

public class AuthorService  {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
