package vn.edu.iuh.fit.www_tuan07_20002975_nguyenvanlong.backend.enums;

import lombok.Getter;

@Getter
public enum ProductStatus {
    ACTIVE(1),//đang kinh doanh
    IN_ACTIVE(0), //tam ngung
    TERMINATED(-1); //khong ban nua
    private final int value;

    ProductStatus(int value) {
        this.value = value;
    }

}
