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
public class Employer {
    @Id
    private String id;
    private String name;
    private TypeOfActivity typeOfActivity;
    private String address;
    private String phone;
    private LocalDateTime createdAt, updatedAt;

    public Employer() {
    }

    public Employer(String name, TypeOfActivity typeOfActivity, String address, String phone) {
        this.name = name;
        this.typeOfActivity = typeOfActivity;
        this.address = address;
        this.phone = phone;
    }

    public Employer(String name, TypeOfActivity typeOfActivity, String address, String phone, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.name = name;
        this.typeOfActivity = typeOfActivity;
        this.address = address;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Employer(String id, String name, TypeOfActivity typeOfActivity, String address, String phone, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.typeOfActivity = typeOfActivity;
        this.address = address;
        this.phone = phone;
        this.createdAt = createdAt;
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

    public TypeOfActivity getTypeOfActivity() {
        return typeOfActivity;
    }

    public void setTypeOfActivity(TypeOfActivity typeOfActivity) {
        this.typeOfActivity = typeOfActivity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        Employer employer = (Employer) o;
        return id.equals(employer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", typeOfActivity='" + typeOfActivity + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public String toJSON() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ", \"name\":\"" + name + '\"' +
                ", \"typeOfActivity\":" + typeOfActivity.toJSON() +
                ", \"address\":\"" + address + '\"' +
                ", \"phone\":\"" + phone + '\"' +
                ", \"createdAt\":\"" + createdAt + '\"' +
                ", \"updatedAt\":\"" + updatedAt + '\"' +
                '}';
    }
}
