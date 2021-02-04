package co.za.sbk.msscbrew.web.controller;

import co.za.sbk.msscbrew.web.model.BeerDto;
import co.za.sbk.msscbrew.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Thato Seboko on 2021/02/03
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    
    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
        
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<BeerDto> handlePost(BeerDto beerDto) {
        BeerDto savedBeerDto = beerService.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        // TODO add host name url
        headers.add("Location", "/api/v1/beer/"+savedBeerDto.getId().toString());
        
        return new ResponseEntity<>(savedBeerDto, headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable UUID beerId, BeerDto beerDto) {
        beerService.updateBeer(beerId, beerDto);        

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    
    
    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){
        beerService.deleteById(beerId);
    }
}
