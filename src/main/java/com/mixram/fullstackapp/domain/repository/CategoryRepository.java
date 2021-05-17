package com.mixram.fullstackapp.domain.repository;

import com.mixram.fullstackapp.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mixram on 2021-05-17.
 * @since 0.1.0.0.0
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
