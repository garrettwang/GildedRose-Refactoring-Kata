package com.gildedrose;

import java.util.Arrays;
import java.util.List;

class GildedRose {
    List<CleanItem> cleanItems;

    public GildedRose(Item[] items) {
        cleanItems = Arrays.stream(items)
            .map(item -> CleanItem.createCleanItem(item.name, item.sellIn, item.quality) )
            .toList();
    }

    public List<CleanItem> cleanItems() {
        return cleanItems;
    }

    public void updateQuality() {
        cleanItems.forEach(CleanItem::doUpdateQuality);
    }

}
