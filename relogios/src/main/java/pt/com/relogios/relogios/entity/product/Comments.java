package pt.com.relogios.relogios.entity.product;
import java.time.LocalDateTime;

import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.Embeddable;;

@Embeddable
public class Comments {
    private String comment;
    //private Client user;
    
    private LocalDateTime date;

    public Comments(String comment) {
        this.comment = comment;
        this.date = LocalDateTime.now();
    }

    public Comments() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    
    



}
