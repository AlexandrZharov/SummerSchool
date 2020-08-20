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
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String qualification;
    private TypeOfActivity typeOfActivity;
    private String description;
    private String estimatedSalary;
    private LocalDateTime createdAt, updatedAt;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String patronymic, String qualification, TypeOfActivity typeOfActivity, String description, String estimatedSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.qualification = qualification;
        this.typeOfActivity = typeOfActivity;
        this.description = description;
        this.estimatedSalary = estimatedSalary;
    }

    public Employee(String firstName, String lastName, String patronymic, String qualification, TypeOfActivity typeOfActivity, String description, String estimatedSalary, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.qualification = qualification;
        this.typeOfActivity = typeOfActivity;
        this.description = description;
        this.estimatedSalary = estimatedSalary;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Employee(String id, String firstName, String lastName, String patronymic, String qualification, TypeOfActivity typeOfActivity, String description, String estimatedSalary, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.qualification = qualification;
        this.typeOfActivity = typeOfActivity;
        this.description = description;
        this.estimatedSalary = estimatedSalary;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public TypeOfActivity getTypeOfActivity() {
        return typeOfActivity;
    }

    public void setTypeOfActivity(TypeOfActivity typeOfActivity) {
        this.typeOfActivity = typeOfActivity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEstimatedSalary() {
        return estimatedSalary;
    }

    public void setEstimatedSalary(String estimatedSalary) {
        this.estimatedSalary = estimatedSalary;
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
        Employee employee = (Employee) o;
        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", qualification='" + qualification + '\'' +
                ", typeOfActivity=" + typeOfActivity +
                ", description='" + description + '\'' +
                ", estimatedSalary='" + estimatedSalary + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"id\":" + id + '\'' +
                ", \"firstName\":\"" + firstName + '\"' +
                ", \"lastName\":\"" + lastName + '\"' +
                ", \"patronymic\":\"" + patronymic + '\"' +
                ", \"qualification\":\"" + qualification + '\"' +
                ", \"typeOfActivity\":\"" + typeOfActivity.toJSON() + '\"' +
                ", \"description\":\"" + description + '\"' +
                ", \"estimatedSalary\":\"" + estimatedSalary + '\"' +
                ", \"createdAt\":\"" + createdAt + '\"' +
                ", \"updatedAt\":\"" + updatedAt + '\"' +
                "}";
    }
}
