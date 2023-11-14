package dev.guillermosg.bcnc.infrastructure.adapters.output.persistence.repository;

import dev.guillermosg.bcnc.infrastructure.adapters.output.persistence.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Price repository.
 */

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {

    /**
     * Find by product id and brand id list.
     *
     * @param productId the product id
     * @param brandId   the brand id
     * @return the list
     */
    List<PriceEntity> findByProductIdAndBrandId(Integer productId, Integer brandId);
}
