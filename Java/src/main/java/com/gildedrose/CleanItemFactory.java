package com.gildedrose;

public class CleanItemFactory {
    private CleanItemFactory() {
    }

    public static CleanItem createCleanItem(String name, int sellIn, int quality) {
        return switch (name) {
            case "Aged Brie" -> new AgedBrie(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert" -> new Backstage(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros" -> new Sulfuras(sellIn, quality);
            default -> new CleanItem(name, sellIn, quality);
        };
    }
}
