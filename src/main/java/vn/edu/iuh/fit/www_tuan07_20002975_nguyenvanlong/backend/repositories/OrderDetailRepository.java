package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.models.OrderDetail;
import vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.pks.OrderDetailPK;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailPK> {
}