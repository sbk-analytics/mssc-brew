package co.za.sbk.msscbrew.services;

import co.za.sbk.msscbrew.web.model.BeerDto;
import co.za.sbk.msscbrew.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */
public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
