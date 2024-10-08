package pt.com.relogios.relogios.dtos;

import org.springframework.beans.BeanUtils;

import pt.com.relogios.relogios.entity.client.Address;
import pt.com.relogios.relogios.entity.client.Client;
import pt.com.relogios.relogios.entity.client.FullName;
import pt.com.relogios.relogios.entity.client.Password;
import pt.com.relogios.relogios.entity.client.Username;

public class ClientDTO {
    
    private Long id;
    private Username username;
    private Address address;
    private FullName fullName;
    private Password password;

    public ClientDTO(Client client){
        BeanUtils.copyProperties(client, this);
    }

    public ClientDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    
}
