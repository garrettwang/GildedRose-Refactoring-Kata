package com.gildedrose;

class AgedBrie extends CleanItem {

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void doUpdateQuality() {
        updateQuality();
        decreaseSellIn();
        updateQualityWhenSellInIsNegative();
    }


    @Override
    void updateQualityWhenSellInIsNegative() {
        if (sellIn < 0 && quality < 50) {
            quality++;
        }
    }

     @Override
     void updateQuality() {
        if (quality < 50) {
            quality++;
        }
    }
}
