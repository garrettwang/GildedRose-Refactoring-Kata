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

    void doDailyUpdate() {
        updatePositiveQuality();
        decreaseSellIn();
        updateQualityAfterExpired();

    }

    void updateQualityAfterExpired() {
        if (sellIn < 0 && quality > 0) {
            decreaseQuality();
        }
    }

    void decreaseSellIn() {
        sellIn--;
    }

    private void updatePositiveQuality() {
        if (quality > 0) {
            decreaseQuality();
        }
    }

    private void decreaseQuality() {
        quality--;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
