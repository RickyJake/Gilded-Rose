package com.gildedrose.rules.specification;

import com.gildedrose.Item;

import java.util.Arrays;
import java.util.List;

public class AndSpecification extends AbstractCompositeSpecification {
    List<Specification> specifications;
    @Override
    public boolean isSatisfiedBy(Item candidate) {
        boolean result = true;

        for (Specification specification : this.specifications) {
            result &= specification.isSatisfiedBy(candidate);
        }
        return result;
    }

    public AndSpecification(Specification... specifications) {
        this.specifications = Arrays.asList(specifications);
    }
}
