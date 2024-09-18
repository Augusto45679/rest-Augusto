package com.example.demo.services;

import com.example.demo.entities.Localidad;
import com.example.demo.repositories.LocalidadRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadService implements BaseService<Localidad>{

    @Autowired
    private LocalidadRepository Localidadrepository;

    @Override
    @Transactional
    public List<Localidad> findAll() throws Exception {
        return List.of();
    }

    @Override
    @Transactional
    public Localidad findById(Long id) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Localidad save(Localidad entity) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Localidad update(Long id, Localidad entity) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
