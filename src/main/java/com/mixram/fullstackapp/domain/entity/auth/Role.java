package com.mixram.fullstackapp.domain.entity.auth;

import lombok.Data;

import javax.persistence.*;

/**
 * @author mixram on 2021-05-14.
 * @since 0.1.0.0.0
 */
@Data
@Entity
@Table(name = "role_data", schema = "tasklist", catalog = "postgres")
public class Role {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "name", nullable = false, length = -1)
    private String name;

}
