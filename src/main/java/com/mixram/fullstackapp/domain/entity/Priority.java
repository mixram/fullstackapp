package com.mixram.fullstackapp.domain.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author mixram on 2021-05-14.
 * @since 0.1.0.0.0
 */
@Entity
@Table(name = "priority", schema = "tasklist", catalog = "postgres")
public class Priority {
    private Long id;
    private String title;
    private String color;
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
    @Column(name = "color", nullable = false, length = -1)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        Priority that = (Priority) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(color,
                                                                                                  that.color) && Objects
                .equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, color, userId);
    }
}
