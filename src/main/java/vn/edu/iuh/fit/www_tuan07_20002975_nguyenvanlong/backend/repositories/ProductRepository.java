package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.enums.ProductStatus;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("FROM Product p WHERE p.status = :status and p.product_id in (SELECT pi.product.product_id FROM ProductImage pi WHERE pi.product = p) and p.product_id in (SELECT pp.product.product_id FROM ProductPrice pp WHERE pp.product = p)")
    Page<Product> findToRender(@Param("status") ProductStatus status, Pageable pageable);

    @Modifying
    @Query("UPDATE Product SET status = :status WHERE product_id = :productId")
    Integer updateStatus(long productId, ProductStatus status);
}