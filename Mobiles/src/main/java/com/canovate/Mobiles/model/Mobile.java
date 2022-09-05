package com.canovate.Mobiles.model;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name= "devices")
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Please provide a brand!")
    private String brand;
    @NotBlank(message = "Please provide a model!")
    private String model;
    @NotBlank(message = "Please provide an os!")
    private String os;
    @NotBlank(message = "Please provide an os version!")
    private String osVersion;

    public Mobile() {

    }

    public Mobile(Integer id, String brand, String model, String os, String osVersion) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.osVersion = osVersion;
    }


    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getOs() {

        return os;
    }

    public void setOs(String os) {

        this.os = os;
    }

    public String getOsVersion() {

        return osVersion;
    }

    public void setOsVersion(String osVersion) {

        this.osVersion = osVersion;
    }


    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", osVersion='" + osVersion + '\'' +
                '}';

    }



}
