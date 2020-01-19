package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {


    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO dto);
}
