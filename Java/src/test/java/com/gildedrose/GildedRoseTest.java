package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateQuality() {
        GildedRose testee = new GildedRose(initialize());
        StringBuilder result = new StringBuilder();
        for (int day = 0; day < 21; day++) {
            testee.updateQuality();
            result.append("-------- day " + day + " --------").append("\n");
            result.append("name, sellIn, quality").append("\n");
            for (Item item : testee.items) {
                result.append(item.toString()).append("\n");
            }
        }
        Approvals.verify(result.toString());
    }

    private Item[] initialize() {
        return new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6) };
    }
}
