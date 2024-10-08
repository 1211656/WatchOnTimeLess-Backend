package pt.com.relogios.relogios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.com.relogios.relogios.entity.client.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
    
}
