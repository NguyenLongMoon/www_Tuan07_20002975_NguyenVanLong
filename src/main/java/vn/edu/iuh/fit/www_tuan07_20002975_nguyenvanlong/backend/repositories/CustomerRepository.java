package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
