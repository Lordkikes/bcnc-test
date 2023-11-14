package dev.guillermosg.bcnc.infrastructure.adapters.output.persistence.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * PriceEntityUnitTest class.
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PriceEntityUnitTest {

    @Autowired
    private TestEntityManager entityManager;

    private PriceEntity priceEntity;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @BeforeEach
    void setup() {
        priceEntity = createAndPersistPrice(1, "2020-06-14 10:00:00", "2020-12-31 23:59:59", 1, 35455, 0,
                new BigDecimal("35.50"), "EUR");
    }

    /**
     * Testea el constructor de la entidad Precio.
     */
    @Test
    void testPriceEntity() {
        assertEquals(1, priceEntity.getBrandId());
        assertEquals(LocalDateTime.parse("2020-06-14 10:00:00", formatter), priceEntity.getStartDate());
        assertEquals(LocalDateTime.parse("2020-12-31 23:59:59", formatter), priceEntity.getEndDate());
        assertEquals(1, priceEntity.getPriceList());
        assertEquals(35455, priceEntity.getProductId());
        assertEquals(0, priceEntity.getPriority());
        assertEquals(new BigDecimal("35.50"), priceEntity.getPrice());
        assertEquals("EUR", priceEntity.getCurrency());
    }

    /**
     * Crea y persiste un objeto Precio en la base de datos.
     *
     * @param brandId   Identificador de la marca
     * @param startDate Fecha de inicio
     * @param endDate   Fecha de fin
     * @param priceList Identificador de la tarifa
     * @param productId Identificador del producto
     * @param priority  Prioridad
     */
    private PriceEntity createAndPersistPrice(Integer brandId, String startDate, String endDate, Integer priceList,
                                              Integer productId, Integer priority, BigDecimal price, String currency) {
        PriceEntity priceEntity = new PriceEntity();
        priceEntity.setBrandId(brandId);
        priceEntity.setStartDate(LocalDateTime.parse(startDate, formatter));
        priceEntity.setEndDate(LocalDateTime.parse(endDate, formatter));
        priceEntity.setPriceList(priceList);
        priceEntity.setProductId(productId);
        priceEntity.setPriority(priority);
        priceEntity.setPrice(price);
        priceEntity.setCurrency(currency);

        return entityManager.persistAndFlush(priceEntity);
    }


}
