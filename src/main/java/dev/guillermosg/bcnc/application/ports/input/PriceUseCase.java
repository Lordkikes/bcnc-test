package dev.guillermosg.bcnc.application.ports.input;

import dev.guillermosg.bcnc.domain.model.PriceResponse;

/**
 * The interface Price use case.
 */
public interface PriceUseCase {

    /**
     * @param fecha
     * @param productId
     * @param brandId
     * @return PriceResponse
     */
    PriceResponse _prices(String fecha, Integer productId, Integer brandId);


}
