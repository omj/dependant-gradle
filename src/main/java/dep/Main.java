package dep;

import example.HelloWorld;
import example.SomeUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("In dependant");
        System.out.println("Constant = " + SomeUtils.CONSTANT);
    }
}

