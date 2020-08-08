package zha.edu.myspringapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;
@Document
public class Examination {
    @Id
    private String id;
    private Student student;
    private int mark;
    private String subject;
    private LocalDateTime date;
    private Teacher teacher;
    private LocalDateTime createdAt, updatedAt;

    public Examination() {
    }

    public Examination(Student student, int mark, String subject, LocalDateTime date, Teacher teacher) {
        this.student = student;
        this.mark = mark;
        this.subject = subject;
        this.date = date;
        this.teacher = teacher;
    }

    public Examination(String id, Student student, int mark, String subject, LocalDateTime date, Teacher teacher) {
        this.id = id;
        this.student = student;
        this.mark = mark;
        this.subject = subject;
        this.date = date;
        this.teacher = teacher;
    }

    public Examination(String id, Student student, int mark, String subject, LocalDateTime date, Teacher teacher, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.student = student;
        this.mark = mark;
        this.subject = subject;
        this.date = date;
        this.teacher = teacher;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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
        Examination that = (Examination) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Examination{" +
                "id='" + id + '\'' +
                ", student=" + student +
                ", mark=" + mark +
                ", subject='" + subject + '\'' +
                ", date=" + date +
                ", teacher=" + teacher +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
