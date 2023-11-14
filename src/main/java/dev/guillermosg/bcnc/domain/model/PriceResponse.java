package dev.guillermosg.bcnc.domain.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * The model Price.
 */

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PriceResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer productId;
    private Integer brandId;
    private Integer priceList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal price;
    private Integer priority;

}
