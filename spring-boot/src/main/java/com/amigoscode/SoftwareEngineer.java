package com.amigoscode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class SoftwareEngineer {

    @Id
    private Integer id;
    private String name;
    private String techStack;

    public SoftwareEngineer() {}

    public SoftwareEngineer(String name, Integer id, String techStack) {
        this.name = name;
        this.id = id;
        this.techStack = techStack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(name, that.name) && Objects.equals(id, that.id) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, techStack);
    }
}
