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
public class Vacancy {
    @Id
    private String id;
    private String employerId;
    private TypeOfActivity typeOfActivity;
    private String commission;
    private LocalDateTime createdAt, updatedAt;

    public Vacancy() {
    }

    public Vacancy(String employerId, TypeOfActivity typeOfActivity, String commission) {
        this.employerId = employerId;
        this.typeOfActivity = typeOfActivity;
        this.commission = commission;
    }

    public Vacancy(String employerId, TypeOfActivity typeOfActivity, String commission, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.employerId = employerId;
        this.typeOfActivity = typeOfActivity;
        this.commission = commission;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Vacancy(String id, String employerId, TypeOfActivity typeOfActivity, String commission, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.employerId = employerId;
        this.typeOfActivity = typeOfActivity;
        this.commission = commission;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployerId() {
        return employerId;
    }

    public void setEmployerId(String employerId) {
        this.employerId = employerId;
    }

    public TypeOfActivity getTypeOfActivity() {
        return typeOfActivity;
    }

    public void setTypeOfActivity(TypeOfActivity typeOfActivity) {
        this.typeOfActivity = typeOfActivity;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
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
        Vacancy vacancy = (Vacancy) o;
        return id.equals(vacancy.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "id='" + id + '\'' +
                ", employerId='" + employerId + '\'' +
                ", typeOfActivity=" + typeOfActivity +
                ", commission='" + commission + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ", \"employerId\":\"" + employerId + '\"' +
                ", \"typeOfActivity\":\"" + typeOfActivity + '\"' +
                ", \"commission\":\"" + commission + '\"' +
                ", \"createdAt\":\"" + createdAt + '\"' +
                ", \"updatedAt\":\"" + updatedAt + '\"' +
                '}';
    }
}
