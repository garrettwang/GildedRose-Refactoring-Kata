package com.gildedrose;

public class Conjured extends CleanItem {
    public Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    public void doUpdateQuality() {
        updateQuality();

        decreaseSellIn();

        updateQualityWhenSellInIsNegative();

    }

    @Override
    void updateQualityWhenSellInIsNegative() {
        if (sellIn < 0 && quality > 0) {
            quality -= 2;
        }
    }

    @Override
    void updateQuality() {
        if (quality > 0) {
            quality -= 2;
        }
    }
}
