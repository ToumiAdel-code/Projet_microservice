package tn.esprit.offrems.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Offre {
    @Id
    private String id;
    private String titre;
    private String description;
    private Double salaire;

    public Offre(String id, String titre, String description, Double salaire) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.salaire = salaire;
    }

    public Offre() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

}
