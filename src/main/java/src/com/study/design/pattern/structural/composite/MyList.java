package src.com.study.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.Collection;

class MyList extends ArrayList<ValueContainer>
{
    public MyList(Collection<? extends ValueContainer> collection)
    {
        super(collection);
    }

    public int sum()
    {
        int amount = 0;

        for (ValueContainer valueContainer : this) {
            for (Integer value : valueContainer) {
                amount += value;
            }
        }

        return amount;
    }
}
