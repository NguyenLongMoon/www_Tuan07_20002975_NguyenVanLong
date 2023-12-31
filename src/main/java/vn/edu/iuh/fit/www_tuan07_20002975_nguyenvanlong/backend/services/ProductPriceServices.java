package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.Product;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.ProductPrice;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.repositories.ProductPriceRepository;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.repositories.ProductRepository;

import java.util.Optional;

@Service
public class ProductPriceServices {
    @Autowired
    private ProductPriceRepository productPriceRepository;
    @Autowired
    private ProductRepository productRepository;

    public Optional<ProductPrice> findNewPrice(long productId) {
        Optional<Product> product = productRepository.findById(productId);

        if (product.isEmpty())
            return Optional.empty();

        return productPriceRepository.findNewPrice(product.get());
    }
}
