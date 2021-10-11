package com.gildedrose.rules.specification;

import com.gildedrose.Item;

public abstract class AbstractSpecification implements Specification {

    @Override
    public abstract Specification and(Specification specification) ;

    @Override
    public abstract Specification not(Specification specification);

    @Override
    public abstract boolean isSatisfiedBy(Item item);

    @Override
    public abstract Item process(Item item);

    @Override
    public abstract Item processItemInfZero(Item item);

    @Override
    public abstract Item processItemInfFive(Item item);

    @Override
    public abstract Item processItemInfTen(Item item);

    @Override
    public abstract Item processItem(Item item);

}
