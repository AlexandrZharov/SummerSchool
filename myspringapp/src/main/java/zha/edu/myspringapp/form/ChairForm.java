package zha.edu.myspringapp.form;

import java.util.Objects;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 11 авг. 2020
 */
public class ChairForm {
    private String id;
    private String name;
    private String description;
    private String chief;

    public ChairForm() {
    }

    public ChairForm(String name, String description, String chief) {
        this.name = name;
        this.description = description;
        this.chief = chief;
    }

    public ChairForm(String id, String name, String description, String chief) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.chief = chief;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChairForm chairForm = (ChairForm) o;
        return id.equals(chairForm.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ChairForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", chief='" + chief + '\'' +
                '}';
    }
}
