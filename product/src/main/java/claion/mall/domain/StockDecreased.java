package claion.mall.domain;

import claion.mall.domain.*;
import claion.mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockDecreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImage;
    private Integer stock;

    public StockDecreased(Inbentory aggregate) {
        super(aggregate);
    }

    public StockDecreased() {
        super();
    }
}
