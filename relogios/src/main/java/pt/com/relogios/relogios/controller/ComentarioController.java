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
import pt.com.relogios.relogios.services.ComentarioService;

@RestController
@RequestMapping(value="/comentario")
@CrossOrigin
public class ComentarioController {
	
	@Autowired
	private ComentarioService comentarioService;

	@GetMapping
	public List<ComentarioDTO> listarTodos(){
		return comentarioService.listarTodos();
	}
	
	@PostMapping
	public void inserir(@RequestBody ComentarioDTO comentario) {
		comentarioService.inserir(comentario);
	}
	
	@PutMapping
	public ComentarioDTO alterar(@RequestBody  ComentarioDTO comentario) {
		return comentarioService.alterar(comentario);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		comentarioService.excluir(id);
		return ResponseEntity.ok().build();
	} 
	
	@GetMapping("/{id}")
	public ComentarioDTO buscarPorId(@PathVariable("id") Long id) {
		return comentarioService.buscarPorId(id);
	}
}
