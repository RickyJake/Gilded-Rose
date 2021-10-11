package com.gildedrose.rules.business;

import com.gildedrose.Item;
import com.gildedrose.rules.specification.AbstractLigthSpecification;

public class RuleConjured extends AbstractLigthSpecification {
    @Override
    public boolean isSatisfiedBy(Item item) {
        return item.name.equals("Conjured Mana Cake");
    }

    @Override
    public Item processItemInfZero(Item item) {
        item.quality = item.quality - 4;
        return item;
    }

    @Override
    public Item processItemInfFive(Item item) {
        item.quality = item.quality - 2;
        return item;
    }

    @Override
    public Item processItemInfTen(Item item) {
        item.quality = item.quality - 2;
        return item;
    }

    @Override
    public Item processItem(Item item) {
        item.quality = item.quality - 2;
        return item;
    }
}
