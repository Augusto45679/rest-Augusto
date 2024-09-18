package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.repositories.AutorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService implements BaseService<Autor>{
    @Autowired
    private AutorRepository autorRepository;

    @Override
    @Transactional
    public List<Autor> findAll() throws Exception {
        return List.of();
    }

    @Override
    @Transactional
    public Autor findById(Long id) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Autor save(Autor entity) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public Autor update(Long id, Autor entity) throws Exception {
        return null;
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
