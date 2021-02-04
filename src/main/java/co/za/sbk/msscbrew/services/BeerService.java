package co.za.sbk.msscbrew.services;

import co.za.sbk.msscbrew.web.model.BeerDto;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/03
 */
public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
