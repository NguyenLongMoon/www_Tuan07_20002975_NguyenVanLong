package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.Product;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.ProductImage;

import java.util.List;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
    List<ProductImage> findByProduct(Product product);
}