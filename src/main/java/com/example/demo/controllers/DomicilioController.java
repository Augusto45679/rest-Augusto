package com.example.demo.controllers;


import com.example.demo.repositories.DomicilioRepository;
import com.example.demo.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController {

    @Autowired
    private DomicilioService domicilioService;


}

