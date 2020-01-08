package src.com.study.design.pattern.structural.composite;

import java.util.ArrayList;

public class CompositeDemo {
    public static void main(String[] args) {
        ManyValues manyValues = new ManyValues();
        manyValues.add(10);
        manyValues.add(15);
        manyValues.add(20);
        manyValues.add(new SingleValue(40).value);

        ArrayList<ValueContainer> valueContainers = new ArrayList<>();
        valueContainers.add(new SingleValue(80));
        valueContainers.add(manyValues);
        valueContainers.add(new SingleValue(5));

        System.out.println("Values on MyList: " + new MyList(valueContainers).toString());
        System.out.println("MyList sum: " + new MyList(valueContainers).sum());
    }
}
