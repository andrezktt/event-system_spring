package com.andrezktt.event_system.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_attender")
public class Attender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    public Attender() {
    }

    public Attender(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attender attender = (Attender) o;
        return Objects.equals(id, attender.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
