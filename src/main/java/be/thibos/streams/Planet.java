package be.thibos.streams;

import java.math.BigDecimal;

public enum Planet {

	MERCURY(57_900_000,
			BigDecimal.valueOf(0.39),
			BigDecimal.valueOf(3.3e23),
			4878,
			452,
			0),
	VENUS(108_200_000,
		  BigDecimal.valueOf(0.723),
		  BigDecimal.valueOf(4.87e24),
		  12104,
		  726,
		  0),
	EARTH(149_600_000,
		  BigDecimal.ONE,
		  BigDecimal.valueOf(5.98e24),
		  12756,
		  310,
		  1),
	MARS(227_900_000,
		 BigDecimal.valueOf(1.524),
		 BigDecimal.valueOf(6.42e23),
		 6787,
		 310,
		 2),
	JUPITER(778_300_000,
			BigDecimal.valueOf(5.203),
			BigDecimal.valueOf(1.90e27),
			142796,
			120,
			67),
	SATURN(1_427_000_000,
		   BigDecimal.valueOf(9.539),
		   BigDecimal.valueOf(5.69e26),
		   120660,
		   88,
		   62),
	URANUS(2_871_000_000L,
		   BigDecimal.valueOf(19.18),
		   BigDecimal.valueOf(8.68e25),
		   51118,
		   59,
		   27),
	NEPTUNE(4_497_100_000L,
			BigDecimal.valueOf(30.06),
			BigDecimal.valueOf(1.02e26),
			48600,
			48,
			13);

	private final long distanceFromSun; // in km
	private final BigDecimal distanceFromSunAU;
	// private final BigDecimal periodOfRevolutionAroundSun; // in Earth days/hours
	// private final BigDecimal periodOfRotationAroundAxis; // in Earth days/hours
	private final BigDecimal mass; // in kg
	private final int diameter; // in km
	private final int temperature; // in Kelvin
	private final int numberOfMoons;

	Planet(
			long distanceFromSun,
			BigDecimal distanceFromSunAU,
			// BigDecimal periodOfRevolutionAroundSun,
			// BigDecimal periodOfRotationAroundAxis,
			BigDecimal mass,
			int diameter,
			int temperature,
			int numberOfMoons) {

		this.distanceFromSun = distanceFromSun;
		this.distanceFromSunAU = distanceFromSunAU;
		// this.periodOfRevolutionAroundSun = periodOfRevolutionAroundSun;
		// this.periodOfRotationAroundAxis = periodOfRotationAroundAxis;
		this.mass = mass;
		this.diameter = diameter;
		this.temperature = temperature;
		this.numberOfMoons = numberOfMoons;
	}

	public long getDistanceFromSun() {
		return distanceFromSun;
	}

	public BigDecimal getDistanceFromSunAU() {
		return distanceFromSunAU;
	}

	public BigDecimal getMass() {
		return mass;
	}

	public int getDiameter() {
		return diameter;
	}

	public int getTemperature() {
		return temperature;
	}

	public int getNumberOfMoons() {
		return numberOfMoons;
	}

	public String getName() {
		return this.name();
	}

	@Override
	public String toString() {
		return getName();
	}

}
