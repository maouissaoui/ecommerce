package com.supinfo.ecommerce.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "Produit")
public class Produit {
    private ObjectId _id;
    private String nom_pr;
    private String prix;
    private String description;
}
