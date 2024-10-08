package pt.com.relogios.relogios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pt.com.relogios.relogios.dtos.ClientDTO;
import pt.com.relogios.relogios.entity.client.Client;
import pt.com.relogios.relogios.repository.ClientRepository;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;

    public void inserir(ClientDTO clientDTO) {
        clientRepository.save(new Client(clientDTO));
    }

    public List<ClientDTO> listarTodos(){
        List<Client> list = clientRepository.findAll();
        return list.stream().map(ClientDTO::new).toList();
    }

    public void alterar(ClientDTO clientDTO){
        clientRepository.save(new Client(clientDTO));
    }

    public void excluir(Long id){
        clientRepository.deleteById(id);
    }

    public ClientDTO buscarPorId(Long id){
        return new ClientDTO(clientRepository.findById(id).get());
    }
}
