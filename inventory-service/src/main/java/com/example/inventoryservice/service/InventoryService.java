package com.example.inventoryservice.service;

import com.example.inventoryservice.model.Inventory;
import com.example.inventoryservice.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public boolean isStock(String skuCode){
        Inventory inventory = inventoryRepository.findBySkuCode(skuCode);
        return inventory==null?false:true;
    }
}
