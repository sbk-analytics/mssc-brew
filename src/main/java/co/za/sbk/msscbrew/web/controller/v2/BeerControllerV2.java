package co.za.sbk.msscbrew.web.controller.v2;

import co.za.sbk.msscbrew.services.BeerService;
import co.za.sbk.msscbrew.services.BeerServiceV2;
import co.za.sbk.msscbrew.web.model.BeerDto;
import co.za.sbk.msscbrew.web.model.v2.BeerDtoV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/04
 */

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    
    private final BeerServiceV2 beerServiceV2;

    @Autowired
    public BeerControllerV2(BeerServiceV2 beerServiceV2) {
        this.beerServiceV2 = beerServiceV2;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable UUID beerId) {

        return new ResponseEntity<>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDtoV2> handlePost(BeerDtoV2 beerDto) {
        BeerDtoV2 savedBeerDto = beerServiceV2.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        // TODO add host name url
        headers.add("Location", "/api/v1/beer/"+savedBeerDto.getId().toString());

        return new ResponseEntity<>(savedBeerDto, headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable UUID beerId, BeerDtoV2 beerDto) {
        beerServiceV2.updateBeer(beerId, beerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){
        beerServiceV2.deleteById(beerId);
    }
}
