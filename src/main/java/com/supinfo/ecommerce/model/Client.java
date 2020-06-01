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
@Document(collection = "Client")
public class Client {

    private ObjectId _id;
    private String nom;
    private String prenom;
    private String date_naissance;
    private String pays;
    private String adresse;
    private String email;
    private String mdp;
    private String Tel;
}

