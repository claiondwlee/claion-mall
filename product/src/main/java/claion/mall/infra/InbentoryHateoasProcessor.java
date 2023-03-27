package claion.mall.infra;

import claion.mall.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class InbentoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Inbentory>> {

    @Override
    public EntityModel<Inbentory> process(EntityModel<Inbentory> model) {
        return model;
    }
}
