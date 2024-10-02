package pt.com.relogios.relogios.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.com.relogios.relogios.dtos.ComentarioDTO;
import pt.com.relogios.relogios.dtos.RelogioDTO;
import pt.com.relogios.relogios.dtos.UsuarioDTO;
import pt.com.relogios.relogios.entity.ComentarioEntity;
import pt.com.relogios.relogios.entity.UsuarioEntity;
import pt.com.relogios.relogios.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioDTO> listarTodos(){
		List<UsuarioEntity> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(UsuarioDTO::new).toList();
	}
	
	public void inserir(UsuarioDTO usuario) {
		UsuarioEntity entidade = new UsuarioEntity(usuario);
		usuarioRepository.save(entidade);
	}
	
	public UsuarioDTO alterar(UsuarioDTO usuario) {
		UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
		return new UsuarioDTO(usuarioRepository.save(usuarioEntity));
	}
	
	public void excluir(Long id) {
		UsuarioEntity entidade = usuarioRepository.findById(id).get();
		usuarioRepository.delete(entidade);
		
	}
	
	public UsuarioDTO buscarPorId(Long id) {
		return new UsuarioDTO(usuarioRepository.findById(id).get());
	}
	

}
