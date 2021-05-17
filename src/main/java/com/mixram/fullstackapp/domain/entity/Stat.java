package com.mixram.fullstackapp.domain.entity;

import com.mixram.fullstackapp.domain.entity.auth.User;
import lombok.Data;

import javax.persistence.*;

/**
 * @author mixram on 2021-05-14.
 * @since 0.1.0.0.0
 */
@Data
@Entity
@Table(name = "stat", schema = "tasklist", catalog = "postgres")
public class Stat {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "completed_total", nullable = false, updatable = false)
    private Long completedTotal;
    @Basic
    @Column(name = "uncompleted_total", nullable = false, updatable = false)
    private Long uncompletedTotal;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

}
