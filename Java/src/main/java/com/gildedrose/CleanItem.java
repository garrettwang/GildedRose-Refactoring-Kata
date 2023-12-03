package com.gildedrose;

class CleanItem {

    String name;

    int sellIn;

    int quality;

    CleanItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static CleanItem createCleanItem(String name, int sellIn, int quality) {
        return switch (name) {
            case "Aged Brie" -> new AgedBrie(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert" -> new Backstage(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros" -> new Sulfuras(sellIn, quality);
            default -> new CleanItem(name, sellIn, quality);
        };
    }

    void doUpdateQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }

        sellIn = sellIn - 1;

        if (sellIn < 0 && quality > 0) {
            quality = quality - 1;
        }


    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
