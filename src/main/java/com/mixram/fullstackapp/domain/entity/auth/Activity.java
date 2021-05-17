package com.mixram.fullstackapp.domain.entity.auth;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author mixram on 2021-05-14.
 * @since 0.1.0.0.0
 */
@Data
@Entity
@Table(name = "activity", schema = "tasklist", catalog = "postgres")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "activated", nullable = false)
    private boolean activated;
    @NotBlank
    @Basic
    @Column(name = "uuid", nullable = false, length = -1, updatable = false)
    private String uuid;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

}
