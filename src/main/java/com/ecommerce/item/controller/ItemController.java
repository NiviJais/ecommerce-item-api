package com.ecommerce.item.controller;

import com.ecommerce.item.dto.ItemRequest;
import com.ecommerce.item.model.Item;
import com.ecommerce.item.service.ItemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> addItem(@Valid @RequestBody ItemRequest request) {
        return ResponseEntity.ok(itemService.addItem(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable Integer id) {
        return ResponseEntity.ok(itemService.getItemById(id));
    }
}
