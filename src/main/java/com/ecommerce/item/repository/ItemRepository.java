package com.ecommerce.item.repository;

import com.ecommerce.item.model.Item;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository {

    private final List<Item> itemList = new ArrayList<>();
    private int idCounter = 1;

    public Item save(Item item) {
        item.setId(idCounter++);
        itemList.add(item);
        return item;
    }

    public Item findById(Integer id) {
        for (Item item : itemList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}

