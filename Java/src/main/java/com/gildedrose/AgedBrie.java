package com.gildedrose;

class AgedBrie extends CleanItem {
    AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void doDailyUpdate() {
        updateQualityForAgedBrie();
        decreaseSellIn();
        updateQualityAfterExpiredForAgedBrie();
    }

    private void updateQualityAfterExpiredForAgedBrie() {
        if (sellIn < 0 && quality < 50) {
            quality = quality + 1;
        }
    }

    private void updateQualityForAgedBrie() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
