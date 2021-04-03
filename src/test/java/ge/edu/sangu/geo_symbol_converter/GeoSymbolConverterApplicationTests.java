package ge.edu.sangu.geo_symbol_converter;

import ge.edu.sangu.geo_symbol_converter.service.AsciiToGeoConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GeoSymbolConverterApplicationTests {

	@Autowired
	private AsciiToGeoConverter asciiToGeoConverter;

	@Test
	void testConverter() {
		Assertions.assertEquals("ტექსტი", asciiToGeoConverter.convertText("teqsti"));
		Assertions.assertEquals("თითო-თითო", asciiToGeoConverter.convertText("TiTo-TiTo"));
	}

}
