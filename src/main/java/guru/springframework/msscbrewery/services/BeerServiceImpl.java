package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

   public BeerDTO getBeerById(UUID beerId){
        return BeerDTO.builder().id(UUID.randomUUID())
                    .beerName("Galaxy Cat")
                    .beerStyle("Pale Ale")
                    .build();
    }

    public BeerDTO saveNewBeer(BeerDTO beerDto) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }


}
