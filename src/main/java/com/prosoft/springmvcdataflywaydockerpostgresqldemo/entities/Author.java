package com.prosoft.springmvcdataflywaydockerpostgresqldemo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {

    @Id
    long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
