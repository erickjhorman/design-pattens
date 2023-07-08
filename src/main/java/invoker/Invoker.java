package invoker;

import command.IOperation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Invoker {
    private List<IOperation> operations = new ArrayList<>();


    public void getOperations(IOperation operation) {
        this.operations.add(operation);
    }

    public void runOperations() {
        this.operations.forEach(IOperation::execute);
    }

}
