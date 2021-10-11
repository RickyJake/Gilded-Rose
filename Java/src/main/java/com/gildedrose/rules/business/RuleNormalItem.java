package com.gildedrose.rules.business;

import com.gildedrose.Item;
import com.gildedrose.rules.specification.AbstractLigthSpecification;

public class RuleNormalItem extends AbstractLigthSpecification {
    RuleAgedBrie ruleAgedBrie = new RuleAgedBrie();
    RuleSulfuras ruleSulfuras = new RuleSulfuras();
    RuleBackStagePasses ruleBackStagePasses = new RuleBackStagePasses();
    RuleConjured ruleConjured = new RuleConjured();
    @Override
    public boolean isSatisfiedBy(Item item) {
        return not(ruleAgedBrie).not(ruleSulfuras).not(ruleBackStagePasses).not(ruleConjured).isSatisfiedBy(item);
    }
}
