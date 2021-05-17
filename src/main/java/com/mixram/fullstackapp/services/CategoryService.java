package com.mixram.fullstackapp.services;

import com.mixram.fullstackapp.domain.entity.Category;
import com.mixram.fullstackapp.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mixram on 2021-05-17.
 * @since 0.1.0.0.0
 */
@Service
public class CategoryService {

    // <editor-fold defaultstate="collapsed" desc="***API elements***">

    private final CategoryRepository repository;

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="***Util elements***">

    @Autowired
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    // </editor-fold>


    @Nullable
    public List<Category> getAll() {
        return repository.findAll();
    }


    // <editor-fold defaultstate="collapsed" desc="***Private elements***">

    //

    // </editor-fold>
}
