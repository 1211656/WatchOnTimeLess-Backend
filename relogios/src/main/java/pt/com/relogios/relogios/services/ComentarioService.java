package pt.com.relogios.relogios.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.com.relogios.relogios.dtos.ComentarioDTO;
import pt.com.relogios.relogios.dtos.RelogioDTO;
import pt.com.relogios.relogios.dtos.UsuarioDTO;
import pt.com.relogios.relogios.entity.ComentarioEntity;
import pt.com.relogios.relogios.repository.ComentarioRepository;

@Service
public class ComentarioService {

	
	@Autowired
	private ComentarioRepository comentarioRepository;
	
	@Autowired
	private RelogioService relogioService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	public List<ComentarioDTO> listarTodos(){
		List<ComentarioEntity> comentarios = comentarioRepository.findAll();
		return comentarios.stream().map(ComentarioDTO::new).toList();
	}
	
	public void inserir(ComentarioDTO comentario) {
		ComentarioEntity entidade = new ComentarioEntity(comentario);
		comentarioRepository.save(entidade);
		
	}
	
	public ComentarioDTO alterar(ComentarioDTO comentario) {
		ComentarioEntity comentarioEntity = new ComentarioEntity(comentario);
		return new ComentarioDTO(comentarioRepository.save(comentarioEntity));
	}
	
	public void excluir(Long id) {
		ComentarioEntity entidade = comentarioRepository.findById(id).get();
		comentarioRepository.delete(entidade);
	}
	
	public ComentarioDTO buscarPorId(Long id) {
		return new ComentarioDTO(comentarioRepository.findById(id).get());
	} 
	
}
