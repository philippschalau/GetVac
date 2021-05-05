package htw.berlin.getvac;

import javax.persistence.*;


@Entity
public class VacCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;


    public VacCenter() {
    }

    public VacCenter(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(String.valueOf(id));
        builder.append(", ");
        builder.append(name);
        builder.append(", ");
        builder.append(address);

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




}


