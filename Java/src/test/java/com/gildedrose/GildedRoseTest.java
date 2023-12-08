package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void updateQuality() {
        StringBuilder result = new StringBuilder();
        GildedRose testee = new GildedRose(initializeItems());
        for (int day = 1; day < 21; day++) {
            result.append("-------- day ").append(day).append(" --------").append("\n");
            result.append("name, sellIn, quality").append("\n");
            testee.cleanItems().forEach(cleanItem -> result.append(cleanItem.toString()).append("\n"));
            testee.updateQuality();
        }
        Approvals.verify(result.toString());
    }

    private Item[] initializeItems() {
        return new Item[]{
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6)};
    }
}
