package dev.guillermosg.bcnc.infrastructure.adapters.input.rest.mapper;

import dev.guillermosg.bcnc.domain.model.PriceResponse;
import dev.guillermosg.bcnc.infrastructure.adapters.input.rest.data.PriceResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * The interface SkinsRestMapper
 */
@Mapper
public interface PriceRestMapper {

    /**
     * To price response dto price response dto.
     *
     * @param priceResponse the price response
     * @return the price response dto
     */
    @Mapping(target = "startDate", source = "startDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(target = "endDate", source = "endDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    PriceResponseDto toPriceResponseDto(PriceResponse priceResponse);
}
