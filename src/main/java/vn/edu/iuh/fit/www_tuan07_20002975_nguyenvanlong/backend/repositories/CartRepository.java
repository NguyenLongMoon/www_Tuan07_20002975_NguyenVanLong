package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.enums.ProductStatus;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.Cart;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.Employee;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.Product;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.pks.CartPK;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, CartPK> {
    @Query("FROM Cart c WHERE c.employee.id = :employeeId AND c.product.status = :status")
    List<Cart> findByEmployee(@Param("employeeId") long employeeId, @Param("status") ProductStatus status);

    void deleteByEmployee(Employee employee);

    Optional<Cart> findByEmployeeAndProduct(Employee employee, Product product);

    void deleteByEmployeeAndProduct(Employee employee, Product product);
}