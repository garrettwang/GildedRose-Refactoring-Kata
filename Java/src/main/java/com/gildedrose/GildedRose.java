package com.gildedrose;

import java.util.Arrays;
import java.util.List;

class GildedRose {
    private final List<CleanItem> cleanItems;

    public GildedRose(Item[] items) {
        cleanItems = Arrays.stream(items)
            .map(item -> CleanItem.createCleanItem(item.name, item.sellIn, item.quality))
            .toList();
    }

    public void updateQuality() {
        cleanItems.forEach(CleanItem::doUpdateQuality);
    }

    public List<CleanItem> cleanItems() {
        return cleanItems;
    }
}
