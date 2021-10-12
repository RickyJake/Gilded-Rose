package com.gildedrose.rules.business;

import com.gildedrose.Item;
import com.gildedrose.rules.specification.AbstractCompositeSpecification;

public class RuleFactory {
    RuleAgedBrie ruleAgedBrie = new RuleAgedBrie();
    RuleSulfuras ruleSulfuras = new RuleSulfuras();
    RuleBackStagePasses ruleBackStagePasses = new RuleBackStagePasses();
    RuleConjured ruleConjured = new RuleConjured();

    public AbstractCompositeSpecification getRule(Item item) {
        if(ruleAgedBrie.isSatisfiedBy(item)) {
            return new RuleAgedBrie();
        }
        else if(ruleSulfuras.isSatisfiedBy(item)) {
            return new RuleSulfuras();
        }
        else if(ruleBackStagePasses.isSatisfiedBy(item)) {
            return new RuleBackStagePasses();
        }
        else if(ruleConjured.isSatisfiedBy(item)) {
            return new RuleConjured();
        }
        else {
            return new RuleNormalItem();
        }

    }
}
