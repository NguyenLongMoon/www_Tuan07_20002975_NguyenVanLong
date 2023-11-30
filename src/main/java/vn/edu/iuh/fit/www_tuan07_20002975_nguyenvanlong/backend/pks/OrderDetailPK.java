package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.pks;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class OrderDetailPK implements Serializable {
    private long order;
    private long product;
}
