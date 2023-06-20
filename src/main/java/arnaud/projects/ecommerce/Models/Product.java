package arnaud.projects.ecommerce.Models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "product")
@Data
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false,insertable = false,updatable = false)
    private ProductCategory category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "units_in_stock")
    private Integer unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp
    private Timestamp dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Timestamp lastUpdated;

    @Column(name = "category_id")
    private long categoryId;


}
