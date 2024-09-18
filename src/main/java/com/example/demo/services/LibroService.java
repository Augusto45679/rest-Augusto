package com.example.demo.services;

import com.example.demo.entities.Libro;
import com.example.demo.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService implements BaseService<Libro> {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Libro findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Libro save(Libro entity) throws Exception {
        return null;
    }

    @Override
    public Libro update(Long id, Libro entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
