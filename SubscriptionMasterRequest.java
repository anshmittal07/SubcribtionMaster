public class SubscriptionMasterRequest {

    private String title;
    private String type;
    private Double price;

    // Constructors, Getters, and Setters
    public SubscriptionMasterRequest() {}

    public SubscriptionMasterRequest(String title, String type, Double price) {
        this.title = title;
        this.type = type;
        this.price = price;
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
