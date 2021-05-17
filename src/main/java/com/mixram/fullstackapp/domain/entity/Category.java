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
@Table(name = "category", schema = "tasklist", catalog = "postgres")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "title", nullable = false, length = -1)
    private String title;
    @Basic
    @Column(name = "completed_count", nullable = true, updatable = false)
    private Long completedCount;
    @Basic
    @Column(name = "uncompleted_count", nullable = true, updatable = false)
    private Long uncompletedCount;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

}
