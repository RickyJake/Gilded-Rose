package com.gildedrose.rules.specification;

import com.gildedrose.Item;

public interface Specification {
    public Specification and(Specification specification);
    public Specification not(Specification specification);
    public boolean isSatisfiedBy(Item item);
    /**
     * This is where we process the quality of the Item
     * @param item
     * @return Item with the correct quality value and sellin value
     */
    public Item process(Item item);

    /**
     * Here we check if the sellin is Inferior to Zero
     * @param item
     * @return Item with the correct quality value and sellin value
     */
    public Item processItemInfZero(Item item);

    /**
     * Here we check if the sellin is between Zero to Five Days
     * @param item
     * @return Item with the correct quality value and sellin value
     */
    public Item processItemInfFive(Item item);

    /**
     * Here we check if the sellin is between Five to Ten Days
     * @param item
     * @return Item with the correct quality value and sellin value
     */
    public Item processItemInfTen(Item item);

    /**
     * Here we check if the sellin is after Ten Days
     * @param item
     * @return Item with the correct quality value and sellin value
     */
    public Item processItem(Item item);
}
