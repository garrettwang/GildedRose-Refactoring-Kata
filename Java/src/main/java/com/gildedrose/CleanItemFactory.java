package com.gildedrose;

class CleanItemFactory {
    private CleanItemFactory() {
    }

    static CleanItem createCleanItem(String name, int sellIn, int quality) {
        return switch (name) {
            case "Aged Brie" -> new AgedBrie(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert" -> new Backstage(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros" -> new Sulfuras(sellIn, quality);
            case "Conjured Mana Cake" -> new Conjured(sellIn, quality);
            default -> new CleanItem(name, sellIn, quality);
        };
    }
}
