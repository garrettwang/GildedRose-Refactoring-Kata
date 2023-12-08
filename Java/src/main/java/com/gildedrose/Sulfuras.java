package com.gildedrose;

public class Sulfuras extends CleanItem {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    void doUpdateQuality() {
        //Do Nothing
    }
}
