package Implementing_the_Factory_Method_Pattern;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }
}

