package com.ouahidi.produitservice.config;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

// On lui dit de chercher les paramètres produit.params
@ConfigurationProperties(prefix = "produit.params")
@Setter
@Getter
//@RefreshScope
@AllArgsConstructor
@NoArgsConstructor
public class ProduitConfig {
    int p1;
    int p2;
}

