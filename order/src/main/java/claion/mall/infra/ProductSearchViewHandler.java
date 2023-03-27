package claion.mall.infra;

import claion.mall.config.kafka.KafkaProcessor;
import claion.mall.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ProductSearchViewHandler {

    @Autowired
    private ProductSearchRepository productSearchRepository;
}
