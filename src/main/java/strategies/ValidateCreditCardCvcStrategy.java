package strategies;

import model.ClientRequest;

public class ValidateCreditCardCvcStrategy implements ValidationStrategy {

    private ClientRequest request;
    public ValidateCreditCardCvcStrategy(ClientRequest request) {
        this.request = request;
    }

    public void validateCardCvv(String cvv) {
        if(cvv.length() > 3) throw new RuntimeException("cvv is more than 3 digits");
    }
    @Override
    public void execute() {
        validateCardCvv(request.getCvv());
        System.out.println("here in validateCard");
    }
}
