package in.olx.inventorymanagement.model.dto;
import in.olx.inventorymanagement.model.enums.ProductType;
import in.olx.inventorymanagement.model.enums.PrimaryStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import in.olx.inventorymanagement.model.enums.ProductType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDTO {
    private String sku;

    private String primaryStatus;
    private String primaryLocation;
    private Double costToCompany;
    private String createdAt;
    private String lastModified;
    private String author;
    private String dealer;
    private String type;

    private Integer yearOfPurchase;


    private String vin;
    private String make;
    private String model;
    private String trim;
    private String condition;
    private String dateOfManufacture;
}

