package com.gildedrose;

class CleanItem  {

    private final String name;

    int sellIn;

    int quality;

    CleanItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }


    void doUpdateQuality() {
        updateQuality();

        decreaseSellIn();

        updateQualityWhenSellInIsNegative();
    }

    void updateQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    void updateQualityWhenSellInIsNegative() {
        if (sellIn < 0 && quality > 0) {
            quality = quality - 1;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


    public void decreaseSellIn() {
        sellIn--;
    }
}
