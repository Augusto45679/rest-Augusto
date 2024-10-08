package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.entities.Localidad;
import com.example.demo.entities.Persona;
import com.example.demo.repositories.LocalidadRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadService implements BaseService<Localidad>{

    @Autowired
    private LocalidadRepository Localidadrepository;
    @Autowired
    private LocalidadRepository localidadRepository;

    @Override
    @Transactional
    public List<Localidad> findAll() throws Exception {
        try{
            List<Localidad> localidades = localidadRepository.findAll();
            return localidades;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Localidad findById(Long id) throws Exception {
        try{
            Optional<Localidad> localidadOptional = localidadRepository.findById(id);
            return localidadOptional.get();
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Localidad save(Localidad entity) throws Exception {
        try {
            entity = localidadRepository.save(entity);
            return entity;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Localidad update(Long id, Localidad entity) throws Exception {
        try {
            Optional<Localidad> entityOptional = localidadRepository.findById(id);
            Localidad localidad = entityOptional.get();
            localidad  = localidadRepository.save(entity);
            return localidad;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if(localidadRepository.existsById(id)){
                localidadRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
