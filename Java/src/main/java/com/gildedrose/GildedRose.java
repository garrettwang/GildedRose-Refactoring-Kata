package com.gildedrose;

import java.util.Arrays;
import java.util.List;

class GildedRose {
    List<CleanItem> cleanItems;

    public GildedRose(Item[] items) {
        cleanItems = Arrays.stream(items)
            .map(item -> new CleanItem(item.name, item.sellIn, item.quality))
            .toList();

    }

    public void updateQuality() {
        cleanItems.forEach(GildedRose::doUpdateQuality);
    }

    private static void doUpdateQuality(CleanItem item) {
        switch (item.name) {
            case "Aged Brie" -> {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0 && item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
            case "Backstage passes to a TAFKAL80ETC concert" -> {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (item.sellIn < 11 && item.quality < 50) {
                        item.quality = item.quality + 1;
                    }

                    if (item.sellIn < 6 && item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0) {
                    item.quality = 0;
                }
            }
            case "Sulfuras, Hand of Ragnaros" -> {
            }
            default -> {
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0 && item.quality > 0) {
                    item.quality = item.quality - 1;
                }
            }
        }

    }

    public List<CleanItem> cleanItems() {
        return cleanItems;
    }
}
