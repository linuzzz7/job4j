package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        Item[] itemWithoutNull = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                itemWithoutNull[size] = this.items[i];
                size++;
            }
        }
        itemWithoutNull = Arrays.copyOf(itemWithoutNull, size);
        return itemWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] temp = new Item[this.items.length];
        int size = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getName().equals(key)) {
                temp[size] = this.items[i];
                size++;
            }
        }
        temp = Arrays.copyOf(temp, size);
        return temp;
    }

    public Item findById(String id) {
        Item temp = null;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                temp = this.items[i];
            }
        }
        return temp;
    }
}