package com.gildedrose.rules.business;

import com.gildedrose.Item;
import com.gildedrose.rules.specification.AbstractLigthSpecification;

public class RuleSulfuras extends AbstractLigthSpecification {
    @Override
    public boolean isSatisfiedBy(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    @Override
    public Item process(Item item) {
        return item;
    }
}
