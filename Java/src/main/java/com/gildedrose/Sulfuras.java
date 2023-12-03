package com.gildedrose;

class Sulfuras extends CleanItem {

    Sulfuras( int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    void doUpdateQuality() {
        //do nothing
    }
}
