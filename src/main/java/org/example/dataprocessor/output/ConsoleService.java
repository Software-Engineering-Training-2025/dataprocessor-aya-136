package org.example.dataprocessor.output;

public class ConsoleService implements OutputTypeService{
    @Override
    public void output(Double result) {
        System.out.println("Result = " + result);
    }
}
