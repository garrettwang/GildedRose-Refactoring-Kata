package com.gildedrose;

class AgedBrie extends CleanItem {
    AgedBrie(int sellIn, int quality) {
        super("Aged Brie",sellIn,quality);
    }

    @Override
    void doUpdateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
        sellIn = sellIn - 1;
        if (sellIn < 0 && quality < 50) {
            quality = quality + 1;
        }
    }
}
