package com.mixram.fullstackapp.domain.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author mixram on 2021-05-14.
 * @since 0.1.0.0.0
 */
@Entity
@Table(name = "activity", schema = "tasklist", catalog = "postgres")
public class Activity {
    private Long id;
    private Short activated;
    private String uuid;
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
    @Column(name = "activated", nullable = false)
    public Short getActivated() {
        return activated;
    }

    public void setActivated(Short activated) {
        this.activated = activated;
    }

    @Basic
    @Column(name = "uuid", nullable = false, length = -1)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
        Activity that = (Activity) o;
        return Objects.equals(id, that.id) && Objects.equals(activated, that.activated) && Objects.equals(uuid,
                                                                                                          that.uuid) && Objects
                .equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, activated, uuid, userId);
    }
}
