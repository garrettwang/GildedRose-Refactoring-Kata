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

    void doUpdateQuality() {
        updatePositiveQuality();
        decreaseSellIn();
        updateQualityAfterExpired();
    }

    private void updateQualityAfterExpired() {
        if (sellIn < 0 && quality > 0) {
            quality = quality - 1;
        }
    }

    void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    private void updatePositiveQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
