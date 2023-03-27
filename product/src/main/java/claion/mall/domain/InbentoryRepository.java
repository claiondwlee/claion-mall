package claion.mall.domain;

import claion.mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "inbentories",
    path = "inbentories"
)
public interface InbentoryRepository
    extends PagingAndSortingRepository<Inbentory, Long> {}
