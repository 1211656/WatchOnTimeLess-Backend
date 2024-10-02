package pt.com.relogios.relogios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.com.relogios.relogios.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long>{

}
