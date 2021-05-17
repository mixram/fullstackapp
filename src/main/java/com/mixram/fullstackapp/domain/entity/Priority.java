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
@Table(name = "priority", schema = "tasklist", catalog = "postgres")
public class Priority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "title", nullable = false, length = -1)
    private String title;
    @Basic
    @Column(name = "color", nullable = false, length = -1)
    private String color;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

}
