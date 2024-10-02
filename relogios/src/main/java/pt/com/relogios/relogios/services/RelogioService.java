package pt.com.relogios.relogios.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.com.relogios.relogios.controller.RelogioController;
import pt.com.relogios.relogios.dtos.ComentarioDTO;
import pt.com.relogios.relogios.dtos.RelogioDTO;
import pt.com.relogios.relogios.entity.ComentarioEntity;
import pt.com.relogios.relogios.entity.RelogioEntity;
import pt.com.relogios.relogios.repository.RelogioRepository;


@Service
public class RelogioService {

	@Autowired
	private RelogioRepository relogioRepository;
	
	
	public List<RelogioDTO> listarTodos(){
		List<RelogioEntity> relogios = relogioRepository.findAll();
		return relogios.stream().map(RelogioDTO::new).toList();
	}
	
	public void inserir(RelogioDTO relogio) {
		RelogioEntity entidade = new RelogioEntity(relogio);
		relogioRepository.save(entidade);
	}
	
	public RelogioDTO alterar(RelogioDTO relogio) {
		RelogioEntity relogioEntity = new RelogioEntity(relogio);
		RelogioEntity relogioEntidade = relogioRepository.save(relogioEntity);
		return new RelogioDTO(relogioEntidade);
		
		
	}
	
	public void excluir(Long id) {
		RelogioEntity entidade = relogioRepository.findById(id).get();
		relogioRepository.delete(entidade);
		
	}
	
	public RelogioDTO buscarPorId(Long id) {
		return new RelogioDTO(relogioRepository.findById(id).get());
	}
	
	
	
	
	
	
	
}
