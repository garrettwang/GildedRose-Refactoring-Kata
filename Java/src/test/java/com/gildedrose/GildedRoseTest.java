package com.gildedrose;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void gildedRose10Days() throws URISyntaxException, IOException {
        URL url = GildedRoseTest.class.getResource("/gilded-rose-10-days-results.txt");
        Path path = Paths.get(Objects.requireNonNull(url).toURI());
        String expected = new String(Files.readAllBytes(path));
        String actual = printResult(11);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    String printResult(int days) {
        StringBuilder result = new StringBuilder();
        result.append("OMGHAI!").append("\n");

        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6) };

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
