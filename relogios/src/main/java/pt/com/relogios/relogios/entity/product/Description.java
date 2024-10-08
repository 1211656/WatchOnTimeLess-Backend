package pt.com.relogios.relogios.entity.product;

import jakarta.persistence.Embeddable;

@Embeddable
public class Description {
    private String descriptionHead;
    private String descriptionBody;
    private String specificDescription;


    public Description(String descriptionHead, String descriptionBody, String specificDescription) {
        this.descriptionHead = descriptionHead;
        this.descriptionBody = descriptionBody;
        this.specificDescription = specificDescription;
    }

    public Description() {
    }


    public String getDescriptionHead() {
        return descriptionHead;
    }


    public void setDescriptionHead(String descriptionHead) {
        this.descriptionHead = descriptionHead;
    }


    public String getDescriptionBody() {
        return descriptionBody;
    }


    public void setDescriptionBody(String descriptionBody) {
        this.descriptionBody = descriptionBody;
    }


    public String getSpecificDescription() {
        return specificDescription;
    }


    public void setSpecificDescription(String specificDescription) {
        this.specificDescription = specificDescription;
    }

    



    
    
    
}
