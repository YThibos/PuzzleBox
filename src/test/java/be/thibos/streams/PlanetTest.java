package be.thibos.streams;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@SuppressWarnings("SimplifyStreamApiCallChains")
class PlanetTest {

	@Test
	@DisplayName("Sort by planet size, largest first")
	@Disabled()
	void planetSize() {
		List<Planet> planetsBySize = List.of(Planet.values()).stream()
				// TODO Implement me
				.collect(Collectors.toList());

		System.out.println("planetsBySize = " + planetsBySize);

		assertThat(planetsBySize).containsExactly(Planet.JUPITER,
												  Planet.SATURN,
												  Planet.URANUS,
												  Planet.NEPTUNE,
												  Planet.EARTH,
												  Planet.VENUS,
												  Planet.MARS,
												  Planet.MERCURY);
	}

	@Test
	@DisplayName("Find the planet with the coldest surface")
	@Disabled
	void coldestPlanet() {
		Planet coldestPlanet = List.of(Planet.values()).stream()
				// TODO Implement me
				.findFirst().get();

		assertThat(coldestPlanet).isEqualTo(Planet.NEPTUNE);
	}
}
