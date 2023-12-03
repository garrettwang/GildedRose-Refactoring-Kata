package com.gildedrose;

import java.util.Arrays;
import java.util.List;

class GildedRose {
    List<CleanItem> cleanItems;

    public GildedRose(Item[] items) {
        cleanItems = Arrays.stream(items)
            .map(GildedRose::apply)
            .toList();
    }

    private static CleanItem apply(Item item) {
        return CleanItem.createCleanItem(item.name, item.sellIn, item.quality);
    }

    public void updateQuality() {
        for (CleanItem cleanItem : cleanItems) {
            cleanItem.doUpdateQuality();
        }
    }

    public List<CleanItem> cleanItems() {
        return cleanItems;
    }
}
