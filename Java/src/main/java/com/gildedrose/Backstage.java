package com.gildedrose;

public class Backstage extends CleanItem {
    Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    void doDailyUpdate() {
        updateQualityForBackstage();
        decreaseSellIn();
        updateQualityAfterExpiredForBackstage();
    }

    private void updateQualityAfterExpiredForBackstage() {
        if (sellIn < 0) {
            quality = 0;
        }
    }

    private void updateQualityForBackstage() {
        if (quality < 50) {
            quality = quality + 1;
            if (sellIn < 11 && quality < 50) {
                quality = quality + 1;
            }

            if (sellIn < 6 && quality < 50) {
                quality = quality + 1;
            }
        }
    }
}
