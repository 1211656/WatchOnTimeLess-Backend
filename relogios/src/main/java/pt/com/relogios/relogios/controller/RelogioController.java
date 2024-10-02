package pt.com.relogios.relogios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.com.relogios.relogios.dtos.ComentarioDTO;
import pt.com.relogios.relogios.dtos.RelogioDTO;
import pt.com.relogios.relogios.services.ComentarioService;
import pt.com.relogios.relogios.services.RelogioService;


@RestController
@RequestMapping(value="/relogio")
@CrossOrigin
public class RelogioController {

	
	@Autowired
	private RelogioService relogioService;
	
	@Autowired
	private ComentarioService comentarioService;

	@GetMapping
	public List<RelogioDTO> listarTodos(){
		return relogioService.listarTodos();
	}
	
	@PostMapping
	public void inserir(@RequestBody RelogioDTO relogio) {
		relogioService.inserir(relogio);
	}
	
	@PutMapping
	public RelogioDTO alterar(@RequestBody  RelogioDTO relogio) {
		return relogioService.alterar(relogio);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		relogioService.excluir(id);
		return ResponseEntity.ok().build();
	} 
	
	@GetMapping("/{id}")
	public RelogioDTO buscarPorId(@PathVariable("id") Long id) {
		return relogioService.buscarPorId(id);
	}
	
	
}
