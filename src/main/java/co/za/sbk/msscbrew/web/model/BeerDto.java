package co.za.sbk.msscbrew.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/03
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    
    private UUID id;
    private String name;
    private String beerStyle;
    private Long upc;
    
}
