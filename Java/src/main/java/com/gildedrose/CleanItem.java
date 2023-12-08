package com.gildedrose;

class CleanItem {

    String name;

    int sellIn;

    int quality;

    public CleanItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

}
