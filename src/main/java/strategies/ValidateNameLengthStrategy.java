package strategies;

import model.ClientRequest;


public class ValidateNameLengthStrategy implements ValidationStrategy {

    private ClientRequest request;

    public ValidateNameLengthStrategy(ClientRequest request) {
        this.request = request;
    }

    public void validateNameLength(String name) {
        if(name.length() == 0) throw new RuntimeException("Name is empty");
    }

    @Override
    public void execute() {
        validateNameLength(request.getName());
        System.out.println("here in validate name");
    }
}
