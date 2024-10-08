package pt.com.relogios.relogios.entity.client;

import org.springframework.beans.BeanUtils;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import pt.com.relogios.relogios.dtos.ClientDTO;

@Entity
@Table(name = "JP_Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Username username;

    @Column
    private Address address;

    @Column(nullable = false)
    private FullName fullName;

    @Column(nullable = false)
    private Password password;

    public Client(ClientDTO dto) {
        BeanUtils.copyProperties(dto, this);
    }

    public Client() {}

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
