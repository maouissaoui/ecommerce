package com.supinfo.ecommerce.controller;

import com.supinfo.ecommerce.model.Produit;
import com.supinfo.ecommerce.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
public class ProduitController {

    @Autowired
    ProduitService produitService;


    @RequestMapping("/produits")
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

}
