
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CoffeeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer coffeeTypeId;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Integer getCoffeeTypeId() {
        return coffeeTypeId;
    }

    public void setCoffeeTypeId(Integer coffeeTypeId) {
        this.coffeeTypeId = coffeeTypeId;
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
