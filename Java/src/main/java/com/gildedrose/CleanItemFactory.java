package com.gildedrose;

public class CleanItemFactory {

    private CleanItemFactory() {
    }

    static CleanItem createCleanItem(String name, int sellIn, int quality) {
        switch (name) {
            case "Aged Brie" -> {
                return new AgedBrie(sellIn, quality);
            }
            case "Backstage passes to a TAFKAL80ETC concert" -> {
                return new Backstage(sellIn, quality);
            }
            case "Sulfuras, Hand of Ragnaros" -> {
                return new Sulfuras(sellIn, quality);
            }
            case "Conjured Mana Cake" -> {
                return new Conjured(sellIn, quality);
            }
            default -> {
                return new CleanItem(name, sellIn, quality);
            }
        }
    }
}
