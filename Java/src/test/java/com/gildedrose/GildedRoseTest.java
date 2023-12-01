package com.gildedrose;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] {Item.createItem("foo", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void gildedRoseAfter20Days() throws URISyntaxException, IOException {
        URL url = GildedRoseTest.class.getResource("/gilded-rose-21-days.txt");
        URI uri = Objects.requireNonNull(url).toURI();
        Path path = Path.of(uri);
        byte[] bytes = Files.readAllBytes(path);
        String expected = new String(bytes);
        String actual = gildedRose(21);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private String gildedRose(int days) {
        StringBuilder result = new StringBuilder();
        result.append("OMGHAI!").append("\n");

        Item[] items = new Item[] {
            Item.createItem("+5 Dexterity Vest", 10, 20), //
            Item.createItem("Aged Brie", 2, 0), //
            Item.createItem("Elixir of the Mongoose", 5, 7), //
            Item.createItem("Sulfuras, Hand of Ragnaros", 0, 80), //
            Item.createItem("Sulfuras, Hand of Ragnaros", -1, 80),
            Item.createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            Item.createItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            Item.createItem("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            Item.createItem("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        for (int i = 0; i < days; i++) {
            result.append("-------- day ").append(i).append(" --------").append("\n");
            result.append("name, sellIn, quality").append("\n");
            for (Item item : items) {
                result.append(item).append("\n");
            }
            result.append("\n");
            app.updateQuality();
        }
        return result.toString();
    }
}
