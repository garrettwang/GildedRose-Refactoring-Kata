package com.gildedrose;

import java.util.Arrays;
import java.util.List;

class GildedRose {
    private final List<CleanItem> cleanItems;

    public GildedRose(Item[] items) {
        this(Arrays.stream(items)
            .map(item -> CleanItemFactory.createCleanItem(item.name, item.sellIn, item.quality))
            .toList());
    }

    public GildedRose(List<CleanItem> cleanItems) {
        this.cleanItems = cleanItems;
    }

    public void updateQuality() {
        cleanItems.forEach(CleanItem::doDailyUpdate);
    }

    public List<CleanItem> cleanItems() {
        return cleanItems;
    }
}
