package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testCasualProductQualityDecreaseWhenSellInDecrease() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 20) };
        GildedRose app = new GildedRose(items);
        int oldDays = app.items[0].sellIn;
        int oldQuality = app.items[0].quality;
        app.updateQuality();

        assertEquals(oldDays-1, app.items[0].sellIn);
        assertEquals(oldQuality-1, app.items[0].quality);
    }

    @Test
    void testCasualProductQualityDropByTwoWhenSellInNegative() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 0, 20) };
        GildedRose app = new GildedRose(items);
        int oldQuality = app.items[0].quality;
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(oldQuality - 2, app.items[0].quality);
    }

    @Test
    void testCasualProductQualityNotEverNegative() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
        app.updateQuality();
        assertEquals(8, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testAgedBrieQualityImproveByTwoWhenSellInIsNegative() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 2) };
        GildedRose app = new GildedRose(items);
        int oldQuality = app.items[0].quality;
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(oldQuality+2, app.items[0].quality);
    }


    @Test
    void testAgedBrieQualityNotAboveFifty() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 48) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void testSulfurasNeverBudge() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 7, 80),
            new Item("Sulfuras, Hand of Ragnaros", -4, 80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(7, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
        assertEquals(-4, app.items[1].sellIn);
        assertEquals(80, app.items[1].quality);
    }

    @Test
    void testBackStagePassesQualityImproveByTwoWhenSellInIsUnderTen() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 2) };
        GildedRose app = new GildedRose(items);
        int oldQuality = app.items[0].quality;
        app.updateQuality();
        assertEquals(oldQuality+2, app.items[0].quality);
        oldQuality = app.items[0].quality;
        app.updateQuality();
        assertEquals(oldQuality+2, app.items[0].quality);
    }

    @Test
    void testBackStagePassesQualityImproveByThreeWhenSellInIsUnderFive() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 2) };
        GildedRose app = new GildedRose(items);
        int oldQuality = app.items[0].quality;
        app.updateQuality();
        assertEquals(oldQuality+3, app.items[0].quality);
        oldQuality = app.items[0].quality;
        app.updateQuality();
        assertEquals(oldQuality+3, app.items[0].quality);
    }

    @Test
    void testBackStagePassesQualityImproveByThreeButNotUpperFiftyWhenSellInIsUnderFive() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void testBackStagePassesQualityDropToZeroWhenSellInIsNegative() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 44) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testBackStagePassesQualityImproveWhenSellInDrop() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 20, 30) };
        GildedRose app = new GildedRose(items);
        int oldQuality = app.items[0].quality;
        app.updateQuality();
        assertEquals(oldQuality + 1, app.items[0].quality);
        oldQuality = app.items[0].quality;
        app.updateQuality();
        assertEquals(oldQuality + 1, app.items[0].quality);
    }

    @Test
    void testConjuredQualityDropTwice() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 1, 10) };
        GildedRose app = new GildedRose(items);
        int oldQuality = app.items[0].quality;
        app.updateQuality();
        assertEquals(oldQuality-2, app.items[0].quality);
        oldQuality = app.items[0].quality;
        app.updateQuality();
        assertEquals(oldQuality-4, app.items[0].quality);
    }
}
