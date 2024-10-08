package pt.com.relogios.relogios.entity.product;

import jakarta.persistence.Embeddable;

@Embeddable
public class Model {
    private String descricao;

    public Model(String desc){
        this.descricao = desc;
    }

    public Model() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    
    
}
