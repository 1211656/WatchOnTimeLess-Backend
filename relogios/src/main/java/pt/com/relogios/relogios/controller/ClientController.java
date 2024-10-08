package pt.com.relogios.relogios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.com.relogios.relogios.dtos.ClientDTO;
import pt.com.relogios.relogios.services.ClientService;

@RestController
@RequestMapping(value="/client")
@CrossOrigin
public class ClientController {
    

    @Autowired
    private ClientService clientService;

    @PostMapping
    public void inserir(@RequestBody ClientDTO clientDTO) {
        clientService.inserir(clientDTO);
    }

    @GetMapping
    public List<ClientDTO> listarTodos() {
        return clientService.listarTodos();
    }

    @PutMapping("/{id}")
    public void alterar(@RequestBody ClientDTO dto) {
        clientService.alterar(dto);
    }

    @DeleteMapping("/{id}")
    public void excluir(@RequestBody Long id) {
        clientService.excluir(id);
    }

    @GetMapping("/{id}")
    public ClientDTO buscarPorId(@RequestBody Long id) {
        return clientService.buscarPorId(id);
    }
}
