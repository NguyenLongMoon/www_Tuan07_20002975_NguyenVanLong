package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.pks;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter @Getter
public class ProductPricePK implements Serializable {
    private Long product;
    private LocalDateTime price_date_time;
}
