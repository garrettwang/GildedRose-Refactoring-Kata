package com.gildedrose;

class Backstage extends CleanItem {

    Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    void doUpdateQuality() {
        updateQuality();

        decreaseSellIn();

        setQualityZeroWhenSellInIsNegative();
    }

    private void setQualityZeroWhenSellInIsNegative() {
        if (sellIn < 0) {
            quality = 0;
        }
    }


    @Override
    void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;

            if (sellIn < 11 && quality < 50) {
                quality++;
            }

            if (sellIn < 6 && quality < 50) {
                quality++;
            }
        }
    }

}
