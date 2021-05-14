package com.mixram.fullstackapp.domain.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author mixram on 2021-05-14.
 * @since 0.1.0.0.0
 */
@Entity
@Table(name = "stat", schema = "tasklist", catalog = "postgres")
public class Stat {
    private Long id;
    private Long completedTotal;
    private Long uncompletedTotal;
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
    @Column(name = "completed_total", nullable = false)
    public Long getCompletedTotal() {
        return completedTotal;
    }

    public void setCompletedTotal(Long completedTotal) {
        this.completedTotal = completedTotal;
    }

    @Basic
    @Column(name = "uncompleted_total", nullable = false)
    public Long getUncompletedTotal() {
        return uncompletedTotal;
    }

    public void setUncompletedTotal(Long uncompletedTotal) {
        this.uncompletedTotal = uncompletedTotal;
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
        Stat that = (Stat) o;
        return Objects.equals(id, that.id) && Objects.equals(completedTotal,
                                                             that.completedTotal) && Objects.equals(
                uncompletedTotal, that.uncompletedTotal) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, completedTotal, uncompletedTotal, userId);
    }
}
