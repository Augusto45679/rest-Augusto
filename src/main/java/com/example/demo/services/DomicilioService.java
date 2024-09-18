package com.example.demo.services;


import com.example.demo.entities.Domicilio;
import com.example.demo.repositories.DomicilioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService implements BaseService<Domicilio>{

    @Autowired
    private DomicilioRepository domicilioRepository;

    @Override
    @Transactional
    public List<Domicilio> findAll() throws Exception {
        return List.of();
    }

    @Override
    @Transactional
    public Domicilio findById(Long id) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Domicilio save(Domicilio entity) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Domicilio update(Long id, Domicilio entity) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
