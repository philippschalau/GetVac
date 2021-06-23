package htw.berlin.getvac;

import javax.persistence.*;


@Entity
public class VacCenter {

    @Id
    private Long id;
    private String name;
    private String street;
    private Long zip;
    private String city;
    private String phone;


    public VacCenter() {
    }

    public VacCenter(Long id, String name, String street, Long zip, String city, String phone) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.phone = phone;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();


        builder.append(name);
        builder.append("\n");
        builder.append(street);
        builder.append("\n");
        builder.append(zip);
        builder.append("\n");
        builder.append(city);
        builder.append("\n");
        builder.append(phone);


        return builder.toString();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getZip() {
        return zip;
    }

    public void setZip(Long zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


