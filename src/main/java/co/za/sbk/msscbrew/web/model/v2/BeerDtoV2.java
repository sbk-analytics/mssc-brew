package co.za.sbk.msscbrew.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {

    private UUID id;
    private String name;
    private BeerStyleEnum beerStyle;
    private Long upc;

}
