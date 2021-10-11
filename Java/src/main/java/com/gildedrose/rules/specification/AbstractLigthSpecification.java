package com.gildedrose.rules.specification;

import com.gildedrose.Item;

public abstract class AbstractLigthSpecification extends AbstractCompositeSpecification {
    @Override
    public abstract boolean isSatisfiedBy(Item item);
}
