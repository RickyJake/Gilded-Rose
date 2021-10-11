package com.gildedrose;

import com.gildedrose.rules.business.*;

import java.util.Arrays;
import java.util.List;

class GildedRose {
    Item[] items;
    RuleAgedBrie ruleAgedBrie = new RuleAgedBrie();
    RuleSulfuras ruleSulfuras = new RuleSulfuras();
    RuleBackStagePasses ruleBackStagePasses = new RuleBackStagePasses();
    RuleNormalItem ruleNormalItem = new RuleNormalItem();
    RuleConjured ruleConjured = new RuleConjured();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if(ruleAgedBrie.isSatisfiedBy(items[i]))
                items[i] = ruleAgedBrie.process(items[i]);
            else if(ruleSulfuras.isSatisfiedBy(items[i]))
                items[i] = ruleSulfuras.process(items[i]);
            else if(ruleBackStagePasses.isSatisfiedBy(items[i]))
                items[i] = ruleBackStagePasses.process(items[i]);
            else if(ruleConjured.isSatisfiedBy(items[i]))
                items[i] = ruleConjured.process(items[i]);
            else if(ruleNormalItem.isSatisfiedBy(items[i]))
                items[i] = ruleNormalItem.process(items[i]);
        }
    }

}
