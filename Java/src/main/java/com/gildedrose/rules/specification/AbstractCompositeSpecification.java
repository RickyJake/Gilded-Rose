package com.gildedrose.rules.specification;

import com.gildedrose.Item;

public class AbstractCompositeSpecification extends AbstractSpecification{

    @Override
    public Specification and(Specification specification) {
        return new AndSpecification(this, specification);
    }

    @Override
    public Specification not(Specification specification) {
        return new NotSpecification(specification);
    }

    @Override
    public boolean isSatisfiedBy(Item item) {
        return false;
    }

    @Override
    public Item process(Item item) {
        item.sellIn = item.sellIn - 1;
        if(item.sellIn < 0)
            item = processItemInfZero(item);
        else if(item.sellIn < 5)
            item = processItemInfFive(item);
        else if(item.sellIn < 10)
            item = processItemInfTen(item);
        else if(item.sellIn < 50)
            item = this.processItem(item);

        if(item.quality > 50)
            item.quality = 50;

        if(item.quality < 0)
            item.quality = 0;

        return item;
    }

    @Override
    public Item processItemInfZero(Item item) {
        item.quality = item.quality - 2;
        return item;
    }

    @Override
    public Item processItemInfFive(Item item) {
        item.quality = item.quality - 1;
        return item;
    }

    @Override
    public Item processItemInfTen(Item item) {
        item.quality = item.quality - 1;
        return item;
    }

    @Override
    public Item processItem(Item item) {
        item.quality = item.quality - 1;
        return item;
    }
}
