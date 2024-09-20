import jakarta.persistence.*;

@Entity
public class SubscriptionMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title; // e.g., "Basic"
    
    private String type; // e.g., "Monthly"
    
    private Double price; // e.g., 99.0

    // Constructors, Getters, and Setters
    public SubscriptionMaster() {}

    public SubscriptionMaster(String title, String type, Double price) {
        this.title = title;
        this.type = type;
        this.price = price;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
