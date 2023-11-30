package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.pks.CartPK;

@Entity
@Table(name = "cart")
@IdClass(CartPK.class)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;
    @Id
    @ManyToOne
    @JoinColumn(name = "prod_id")
    private Product product;
    @Column(name = "qty", nullable = false)
    private int quantity;

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}
