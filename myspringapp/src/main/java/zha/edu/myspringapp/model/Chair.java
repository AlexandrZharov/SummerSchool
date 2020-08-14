package zha.edu.myspringapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;
@Document
public class Chair {
    @Id
    private String id;
    private String name;
    private String chief;
    private String description;
    private LocalDateTime createdAt, updatedAt;

    public Chair(String id, String name, String chief, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Chair(String name, String chief, String description) {
        this.name = name;
        this.chief = chief;
        this.description = description;
    }

    public Chair(String id, String name, String chief, String description) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.description = description;
    }

    public Chair() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
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

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chief='" + chief + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return id.equals(chair.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String toJSON() {
        return "{" +
                "\"id\"" + ":" + "\"" + this.getId() + "\"" +
                ",\"name\"" + ":" + "\"" + this.getName() + "\"" +
                ",\"description\"" + ":" + "\"" + this.getDescription() + "\"" +
                ",\"chief\"" + ":" +"\"" + this.getChief() + "\"" +
                ",\"createdAt\"" + ":" +"\"" + this.getCreatedAt() + "\"" +
                ",\"updatedAt\"" + ":" +"\"" + this.getUpdatedAt() + "\"" +
                "}";
    }
}
