package com.mixram.fullstackapp.domain.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author mixram on 2021-05-14.
 * @since 0.1.0.0.0
 */
@Entity
@Table(name = "category", schema = "tasklist", catalog = "postgres")
public class Category {
    private Long id;
    private String title;
    private Long completedCount;
    private Long uncompletedCount;
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
    @Column(name = "completed_count", nullable = true)
    public Long getCompletedCount() {
        return completedCount;
    }

    public void setCompletedCount(Long completedCount) {
        this.completedCount = completedCount;
    }

    @Basic
    @Column(name = "uncompleted_count", nullable = true)
    public Long getUncompletedCount() {
        return uncompletedCount;
    }

    public void setUncompletedCount(Long uncompletedCount) {
        this.uncompletedCount = uncompletedCount;
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
        Category that = (Category) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(completedCount,
                                                                                                  that.completedCount) && Objects
                .equals(uncompletedCount, that.uncompletedCount) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, completedCount, uncompletedCount, userId);
    }
}
