package com.example.crud.Domain.Product;

//import io.micrometer.core.ipc.http.HttpSender.Request;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "product")
@Entity(name = "product")
@Getter // Seta todos os getters dos meus atributos
@Setter // Seta todos os setters dos meus atributos
@AllArgsConstructor // cria um construtor que recebe todos os parametros e seta todos os parametros
@NoArgsConstructor // cria um construtor que não recebe nem seta parametros
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price_in_cents;

    private Boolean active;

    public Product(RequestProduct requestProduct) {
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
        this.active = true;
    }
}
