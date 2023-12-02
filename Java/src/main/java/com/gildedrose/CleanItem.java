package com.gildedrose;

import java.util.Objects;

class CleanItem {

    String name;
    int sellIn;
    int quality;

    CleanItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
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
            default -> {
                return new CleanItem(name, sellIn, quality);
            }
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CleanItem cleanItem = (CleanItem) o;
        return sellIn == cleanItem.sellIn && quality == cleanItem.quality && Objects.equals(name, cleanItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sellIn, quality);
    }
}
