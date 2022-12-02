package com.crud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.demo.modelo.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer> {

}
