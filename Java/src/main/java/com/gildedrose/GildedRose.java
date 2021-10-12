package com.gildedrose;

import com.gildedrose.rules.business.*;

import java.util.Arrays;
import java.util.List;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        final RuleFactory factory = new RuleFactory();
        Arrays.stream(items)
            .map(item -> factory.getRule(item).process(item))
            .toArray();
    }

}
