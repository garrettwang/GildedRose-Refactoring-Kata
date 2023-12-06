package com.gildedrose;

class Conjured extends CleanItem {
    Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn,quality);
    }


    @Override
    void doUpdateQuality() {
        updateQualityForConjured();
        decreaseSellIn();
        updateQualityAfterExpired();
    }

    private void updateQualityForConjured() {
        if (quality > 0) {
            quality = quality - 2;
        }
    }

}
