package arnaud.projects.ecommerce.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
import java.util.Set;

@Entity
@Data
@Table(name = "product_category")
public class ProductCategory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;

}
