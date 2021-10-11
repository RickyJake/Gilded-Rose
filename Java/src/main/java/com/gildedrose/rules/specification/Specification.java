package com.gildedrose.rules.specification;

import com.gildedrose.Item;

public interface Specification {
    public Specification and(Specification specification);
    public Specification not(Specification specification);
    public boolean isSatisfiedBy(Item item);
    public Item process(Item item);
    public Item processItemInfZero(Item item);
    public Item processItemInfFive(Item item);
    public Item processItemInfTen(Item item);
    public Item processItem(Item item);
}
