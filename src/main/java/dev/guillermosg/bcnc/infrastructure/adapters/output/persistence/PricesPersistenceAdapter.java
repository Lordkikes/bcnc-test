package dev.guillermosg.bcnc.infrastructure.adapters.output.persistence;

import dev.guillermosg.bcnc.application.ports.output.PriceOutputPort;
import dev.guillermosg.bcnc.domain.model.PriceResponse;
import dev.guillermosg.bcnc.infrastructure.adapters.output.persistence.mapper.PricePersistenceMapper;
import dev.guillermosg.bcnc.infrastructure.adapters.output.persistence.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The type Prices persistence adapter.
 */
@Component
@RequiredArgsConstructor
public class PricesPersistenceAdapter implements PriceOutputPort {

    private final PriceRepository priceRepository;
    private final PricePersistenceMapper pricePersistenceMapper;


    /**
     * @param productId
     * @param brandId
     * @return List<PriceResponse>
     */
    @Override
    public List<PriceResponse> _prices(Integer productId, Integer brandId) {
        return priceRepository.findByProductIdAndBrandId(productId, brandId).stream()
                .map(pricePersistenceMapper::toPriceResponse)
                .toList();
    }
}
