package app.petmanager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
@Table(name = "pets")
public class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;
    @Column
    @Size(min = 1, max = 255)
    private String petCode;
    @Column
    @Size(min = 1, max = 255)
    private String name;
    @Column
    @Size(min = 1, max = 255)
    private String type;
    @Column
    @Size(min = 1, max = 255)
    private String color;
    @Column
    @Size(min = 1, max = 255)
    private String country;

    public Long getId() {
        return id;
    }

    public Pet setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPetCode() {
        return petCode;
    }

    public Pet setPetCode(String petCode) {
        this.petCode = petCode;
        return this;
    }

    public String getName() {
        return name;
    }

    public Pet setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Pet setType(String type) {
        this.type = type;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Pet setColor(String color) {
        this.color = color;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Pet setCountry(String country) {
        this.country = country;
        return this;
    }

    public Pet() {
    }

}


