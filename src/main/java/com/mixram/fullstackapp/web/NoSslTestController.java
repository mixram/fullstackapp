package com.mixram.fullstackapp.web;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mixram on 2021-05-13.
 * @since 0.1.0.0.0
 */
@Profile({"dev"})
@Log4j2
@RestController
@RequestMapping(value = "/api-test", produces = MediaType.APPLICATION_JSON_VALUE)
public class NoSslTestController {

    // <editor-fold defaultstate="collapsed" desc="***API elements***">

    //

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="***Util elements***">

    //

    // </editor-fold>


    @GetMapping("/test-string")
    @ResponseBody
    public String sslStringTest() {
        return "Response without ssl :-)";
    }


    // <editor-fold defaultstate="collapsed" desc="***Private elements***">

    //

    // </editor-fold>
}
