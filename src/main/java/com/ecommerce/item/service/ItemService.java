package com.ecommerce.item.service;

import com.ecommerce.item.dto.ItemRequest;
import com.ecommerce.item.model.Item;

public interface ItemService {
    Item addItem(ItemRequest request);
    Item getItemById(Integer id);
}
