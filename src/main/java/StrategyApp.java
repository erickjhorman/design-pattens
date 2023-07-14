import model.ClientRequest;
import strategies.ValidateCreditCardCvcStrategy;
import strategies.ValidateNameLengthStrategy;

import java.util.List;

public class StrategyApp {

    public static void main(String[] args) {
        var clientReq = new ClientRequest("", "145");
        var strategies = List.of(new ValidateCreditCardCvcStrategy(clientReq), new ValidateNameLengthStrategy(clientReq));

        strategies.forEach(x -> x.execute());
    }
}
