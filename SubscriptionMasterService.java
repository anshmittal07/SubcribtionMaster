import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionMasterService {

    @Autowired
    private SubscriptionMasterRepository subscriptionMasterRepository;

    // Method to add a new subscription plan
    public SubscriptionMaster addSubscriptionMaster(String title, String type, Double price) {
        SubscriptionMaster subscriptionMaster = new SubscriptionMaster(title, type, price);
        return subscriptionMasterRepository.save(subscriptionMaster);
    }
}
