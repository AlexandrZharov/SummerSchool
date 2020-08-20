package zha.idz.employmentoffice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 19 авг. 2020
 */
@Document
public class TypeOfActivity {
    @Id
    private String id;
    private String typeOfActivity;
    private LocalDateTime createdAt, updatedAt;

    public TypeOfActivity() {
    }

    public TypeOfActivity(String typeOfActivity) {
        this.typeOfActivity = typeOfActivity;
    }

    public TypeOfActivity(String typeOfActivity, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.typeOfActivity = typeOfActivity;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public TypeOfActivity(String id, String typeOfActivity, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.typeOfActivity = typeOfActivity;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeOfActivity() {
        return typeOfActivity;
    }

    public void setTypeOfActivity(String typeOfActivity) {
        this.typeOfActivity = typeOfActivity;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfActivity that = (TypeOfActivity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TypeOfActivity{" +
                "id='" + id + '\'' +
                ", typeOfActivity='" + typeOfActivity + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ", \"typeOfActivity\":\"" + typeOfActivity + '\"' +
                ", \"createdAt\":\"" + createdAt + '\"' +
                ", \"updatedAt\":\"" + updatedAt + '\"' +
                '}';
    }
}
