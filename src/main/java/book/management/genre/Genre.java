package book.management.genre;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genre {

    @Id
    private String name;
    private String description;


    public Genre() {
    }

    public Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
