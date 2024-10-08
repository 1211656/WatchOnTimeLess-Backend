package pt.com.relogios.relogios.entity.product;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
@Embeddable
public class Album {
    
    @ElementCollection
    private List<String> album1;

    public Album(List<String> album1) {
        this.album1 = album1;
    }

    public Album() {
    }

    public List<String> getAlbum1() {
        return album1;
    }

    public void setAlbum1(List<String> album1) {
        this.album1 = album1;
    }

    
}
