package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // Cette méthode va générer des Code Smells (Variables inutilisées, complexité)
    public void codeSaleMethode() {
        int x = 10; // Variable inutilisée (Code Smell)
        int y = 20; 
        
        if (true) { // Condition stupide
            if (true) {
                if (true) {
                    System.out.println("Trop d'imbrications !"); // Complexité cognitive
                }
            }
        }
        
        String motDePasse = "12345"; // Fail de sécurité potentiel
    }
}
