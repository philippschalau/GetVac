package htw.berlin.getvac;

import javax.persistence.*;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String vaccenter;
    private String comment;
    private String grade;
    private String owner;


    public Rating() {
    }

    public Rating(String firstname, String lastname, String vaccenter, String comment, String grade) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.vaccenter = vaccenter;
        this.comment = comment;
        this.grade = grade;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();


        builder.append(firstname);
        builder.append("\n");
        builder.append(lastname);
        builder.append("\n");
        builder.append(owner);
        builder.append("\n");
        builder.append(vaccenter);
        builder.append("\n");
        builder.append(grade);
        builder.append("\n");
        builder.append(comment);

        return builder.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getVaccenter() {
        return vaccenter;
    }

    public void setVaccenter(String vaccenter) {
        this.vaccenter = vaccenter;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}