package com.mixram.fullstackapp.domain.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author mixram on 2021-05-14.
 * @since 0.1.0.0.0
 */
@Entity
@Table(name = "task", schema = "tasklist", catalog = "postgres")
public class Task {
    private Long id;
    private String title;
    private Short completed;
    private Timestamp taskDate;
    private Long priorityId;
    private Long categoryId;
    private Long userId;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = false, length = -1)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "completed", nullable = true)
    public Short getCompleted() {
        return completed;
    }

    public void setCompleted(Short completed) {
        this.completed = completed;
    }

    @Basic
    @Column(name = "task_date", nullable = true)
    public Timestamp getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(Timestamp taskDate) {
        this.taskDate = taskDate;
    }

    @Basic
    @Column(name = "priority_id", nullable = true)
    public Long getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Long priorityId) {
        this.priorityId = priorityId;
    }

    @Basic
    @Column(name = "category_id", nullable = true)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task that = (Task) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(completed,
                                                                                                  that.completed) && Objects
                .equals(taskDate, that.taskDate) && Objects.equals(priorityId, that.priorityId) && Objects.equals(
                categoryId, that.categoryId) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, completed, taskDate, priorityId, categoryId, userId);
    }
}
