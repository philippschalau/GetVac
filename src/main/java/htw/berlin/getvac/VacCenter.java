package htw.berlin.getvac;

import javax.persistence.*;


@Entity
public class VacCenter {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phone;


    public VacCenter() {
    }

    public VacCenter(Long id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }



    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(String.valueOf(id));
        builder.append(", ");
        builder.append(name);
        builder.append(", ");
        builder.append(address);
        builder.append(", ");
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


