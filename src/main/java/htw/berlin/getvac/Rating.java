package htw.berlin.getvac;

import javax.persistence.*;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String vaccenter;
    private String comment;
    private String grade;
    private String owner;


    public Rating() {
    }

    public Rating(String vaccenter, String comment, String grade) {
        this.vaccenter = vaccenter;
        this.comment = comment;
        this.grade = grade;
        this.owner = owner;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(owner);
        builder.append("\n");
        builder.append(vaccenter);
        builder.append("\n");
        builder.append(grade);
        builder.append("\n");
        builder.append(comment);

        return builder.toString();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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