package com.gildedrose.rules.business;

import com.gildedrose.Item;
import com.gildedrose.rules.specification.AbstractLigthSpecification;

public class RuleBackStagePasses extends AbstractLigthSpecification {
    @Override
    public boolean isSatisfiedBy(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    @Override
    public Item processItemInfZero(Item item) {
        item.quality = 0;
        return item;
    }

    @Override
    public Item processItemInfFive(Item item) {
        item.quality = item.quality + 3;
        return item;
    }

    @Override
    public Item processItemInfTen(Item item) {
        item.quality = item.quality + 2;
        return item;
    }

    @Override
    public Item processItem(Item item) {
        item.quality = item.quality + 1;
        return item;
    }
}
