package com.ecommerce.item.service;

import com.ecommerce.item.dto.ItemRequest;
import com.ecommerce.item.exception.ItemNotFoundException;
import com.ecommerce.item.model.Item;
import com.ecommerce.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public Item addItem(ItemRequest request) {
        Item item = new Item();
        item.setName(request.getName());
        item.setDescription(request.getDescription());
        item.setPrice(request.getPrice());
        item.setQuantity(request.getQuantity());

        return itemRepository.save(item);
    }

    @Override
    public Item getItemById(Integer id) {
        Item item = itemRepository.findById(id);
        if (item == null) {
            throw new ItemNotFoundException("Item not found with id: " + id);
        }
        return item;
    }
}