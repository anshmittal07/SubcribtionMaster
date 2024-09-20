import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subscription-masters")
public class SubscriptionMasterController {

    @Autowired
    private SubscriptionMasterService subscriptionMasterService;

    // API to add a new subscription plan
    @PostMapping("/add")
    public SubscriptionMaster addSubscriptionMaster(@RequestBody SubscriptionMasterRequest request) {
        return subscriptionMasterService.addSubscriptionMaster(request.getTitle(), request.getType(), request.getPrice());
    }
}
