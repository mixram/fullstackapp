package com.mixram.fullstackapp.web;

import com.mixram.fullstackapp.domain.entity.Category;
import com.mixram.fullstackapp.services.CategoryService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mixram on 2021-05-17.
 * @since 0.1.0.0.0
 */
@Log4j2
@RestController
@RequestMapping(value = "/api/category", produces = MediaType.APPLICATION_JSON_VALUE)
public class CategoryController {

    // <editor-fold defaultstate="collapsed" desc="***API elements***">

    private final CategoryService service;

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="***Util elements***">

    @Autowired
    public CategoryController(CategoryService service) {
        this.service = service;
    }

    // </editor-fold>


    @GetMapping("/all")
    @ResponseBody
    public List<Category> getAll() {
        return service.getAll();
    }


    // <editor-fold defaultstate="collapsed" desc="***Private elements***">

    //

    // </editor-fold>
}
