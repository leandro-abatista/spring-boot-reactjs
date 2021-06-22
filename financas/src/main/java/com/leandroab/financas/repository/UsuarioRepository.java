package com.leandroab.financas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandroab.financas.models.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
