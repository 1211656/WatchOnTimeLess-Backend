package pt.com.relogios.relogios.entity.client;

import jakarta.persistence.Embeddable;

@Embeddable
public class Username {
    
    private String username;
    
    public Username(String username) {
        this.username = username;
    }

    public Username() {}

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
