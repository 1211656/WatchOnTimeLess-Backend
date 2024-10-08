package pt.com.relogios.relogios.entity.product;

import jakarta.persistence.Embeddable;

@Embeddable
public class Brand {
    private String name;
    private Model model;
    public Brand(String name, Model model) {
        this.name = name;
        this.model = model;
    }

    public Brand() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Model getModel() {
        return model;
    }
    public void setModel(Model model) {
        this.model = model;
    }

    
}
