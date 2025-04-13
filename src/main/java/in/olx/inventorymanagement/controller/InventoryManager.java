package in.olx.inventorymanagement.controller;

import in.olx.inventorymanagement.model.dto.InventoryDTO;
import in.olx.inventorymanagement.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/inventories")
public class InventoryManager {

    private final InventoryService inventoryService = null;


    @GetMapping ("/health")
    public String health() {
        return "Hello World!!";
    }

    // Rest All Routes are to be added below:
    @GetMapping("")
    public InventoryDTO getAllInventories() {
        return null;
    }

    @GetMapping("/{sku}")
    public InventoryDTO getInventoryById(@PathVariable String sku) {
        return null;
    }

    @PutMapping("/{sku}")
    public InventoryDTO updateInventory(@PathVariable String sku, @RequestBody InventoryDTO inventoryDTO) {
        return null;
    }

    @PostMapping("")
    public InventoryDTO createInventory(@RequestBody InventoryDTO inventoryDTO) {
        return null;
    }

    @GetMapping
    public Page<InventoryDTO> getAllInventoriesWithPagination(@RequestParam(defaultValue = "0") int page) {
        return  inventoryService.getAllInventoriesWithPagination(page);
    }
}
