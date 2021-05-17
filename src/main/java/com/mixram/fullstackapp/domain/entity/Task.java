package com.mixram.fullstackapp.domain.entity;

import com.mixram.fullstackapp.domain.entity.auth.User;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author mixram on 2021-05-14.
 * @since 0.1.0.0.0
 */
@Data
@Entity
@Table(name = "task", schema = "tasklist", catalog = "postgres")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "title", nullable = false, length = -1)
    private String title;
    @Basic
    @Column(name = "completed", nullable = true)
    private Short completed;
    @Basic
    @Column(name = "task_date", nullable = true)
    private Date taskDate;
    @ManyToOne
    @JoinColumn(name = "priority_id", referencedColumnName = "id")
    private Priority priority;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

}
