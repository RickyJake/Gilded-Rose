package com.gildedrose.rules.specification;

import com.gildedrose.Item;

import java.util.Arrays;
import java.util.List;

public class NotSpecification extends AbstractCompositeSpecification {
    Specification specification;
    @Override
    public boolean isSatisfiedBy(Item candidate) {
        boolean result = true;

        return !this.specification.isSatisfiedBy(candidate);
    }

    public NotSpecification(Specification specification) {
        this.specification = specification;
    }
}
