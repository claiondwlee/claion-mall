package claion.mall.domain;

import claion.mall.ProductApplication;
import claion.mall.domain.StockDecreased;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Inbentory_table")
@Data
public class Inbentory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private String productImage;

    private Integer stock;

    @PostPersist
    public void onPostPersist() {
        StockDecreased stockDecreased = new StockDecreased(this);
        stockDecreased.publishAfterCommit();
    }

    public static InbentoryRepository repository() {
        InbentoryRepository inbentoryRepository = ProductApplication.applicationContext.getBean(
            InbentoryRepository.class
        );
        return inbentoryRepository;
    }

    public static void decreaseStock(DeliveryStarted deliveryStarted) {
        /** Example 1:  new item 
        Inbentory inbentory = new Inbentory();
        repository().save(inbentory);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(inbentory->{
            
            inbentory // do something
            repository().save(inbentory);


         });
        */

    }
}
