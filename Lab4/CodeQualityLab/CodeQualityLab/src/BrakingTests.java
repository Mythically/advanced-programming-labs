import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BrakingTests {

	@Test
	void allDriverWarm() {
		try {
			BrakingDistanceEstimator dryDriver = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVERONLY,
					BrakingConditions.BRAKES_WARM
			);

			BrakingDistanceEstimator wetDriver = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_WET,
					BrakingConditions.LOADING_DRIVERONLY,
					BrakingConditions.BRAKES_WARM
			);
			BrakingDistanceEstimator snowDriver = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_SNOW,
					BrakingConditions.LOADING_DRIVERONLY,
					BrakingConditions.BRAKES_WARM
			);
			BrakingDistanceEstimator dampDriver = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DAMP,
					BrakingConditions.LOADING_DRIVERONLY,
					BrakingConditions.BRAKES_WARM
			);




			// driver only, warm brakes, all conditions
			assertTrue(dryDriver.getBrakingDistanceFor(40) < wetDriver.getBrakingDistanceFor(40));
			assertTrue(dryDriver.getBrakingDistanceFor(40) < dampDriver.getBrakingDistanceFor(40));
			assertTrue(dryDriver.getBrakingDistanceFor(40) < snowDriver.getBrakingDistanceFor(40));
			assertTrue(dampDriver.getBrakingDistanceFor(40) < wetDriver.getBrakingDistanceFor(40));
			assertTrue(dampDriver.getBrakingDistanceFor(40) < snowDriver.getBrakingDistanceFor(40));
			assertTrue(wetDriver.getBrakingDistanceFor(40) < snowDriver.getBrakingDistanceFor(40));
			//driver passenger, warm brakes, all conditions
			// full, warm brakes, all conditions
			//driveronly, cold brakes, all conditions

			//driver passenger, cold brakes, all conditions

			//full, cold brakes, all conditions


		} catch (InvalidBrakingConditionsException e) {
			fail(e);
		}
	}

	@Test
	void allPassWarm() {
		try {
			BrakingDistanceEstimator dryPass = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVER_PASSENGER,
					BrakingConditions.BRAKES_WARM
			);

			BrakingDistanceEstimator wetPass = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_WET,
					BrakingConditions.LOADING_DRIVER_PASSENGER,
					BrakingConditions.BRAKES_WARM
			);
			BrakingDistanceEstimator snowPass = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_SNOW,
					BrakingConditions.LOADING_DRIVER_PASSENGER,
					BrakingConditions.BRAKES_WARM
			);
			BrakingDistanceEstimator dampPass = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DAMP,
					BrakingConditions.LOADING_DRIVER_PASSENGER,
					BrakingConditions.BRAKES_WARM
			);
			assertTrue(dryPass.getBrakingDistanceFor(40) < dampPass.getBrakingDistanceFor(40));
			assertTrue(dryPass.getBrakingDistanceFor(40) < wetPass.getBrakingDistanceFor(40));
			assertTrue(dryPass.getBrakingDistanceFor(40) < snowPass.getBrakingDistanceFor(40));
			assertTrue(dampPass.getBrakingDistanceFor(40) < wetPass.getBrakingDistanceFor(40));
			assertTrue(dampPass.getBrakingDistanceFor(40) < snowPass.getBrakingDistanceFor(40));
			assertTrue(wetPass.getBrakingDistanceFor(40) < snowPass.getBrakingDistanceFor(40));
		} catch (InvalidBrakingConditionsException e) {
			fail(e);
		}
	}


	@Test
	void allFullWarm() {
		try {
			BrakingDistanceEstimator dryFull = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_FULL,
					BrakingConditions.BRAKES_WARM
			);

			BrakingDistanceEstimator wetFull = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_WET,
					BrakingConditions.LOADING_FULL,
					BrakingConditions.BRAKES_WARM
			);
			BrakingDistanceEstimator snowFull = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_SNOW,
					BrakingConditions.LOADING_FULL,
					BrakingConditions.BRAKES_WARM
			);
			BrakingDistanceEstimator dampFull = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DAMP,
					BrakingConditions.LOADING_FULL,
					BrakingConditions.BRAKES_WARM

			);
			assertTrue(dryFull.getBrakingDistanceFor(40) < dampFull.getBrakingDistanceFor(40));
			assertTrue(dryFull.getBrakingDistanceFor(40) < wetFull.getBrakingDistanceFor(40));
			assertTrue(dryFull.getBrakingDistanceFor(40) < snowFull.getBrakingDistanceFor(40));
			assertTrue(dampFull.getBrakingDistanceFor(40) < wetFull.getBrakingDistanceFor(40));
			assertTrue(dampFull.getBrakingDistanceFor(40) < snowFull.getBrakingDistanceFor(40));
			assertTrue(wetFull.getBrakingDistanceFor(40) < snowFull.getBrakingDistanceFor(40));


		} catch (InvalidBrakingConditionsException e) {
			fail(e);
		}


	}
	@Test
	void allDryCold() {
		try {
			BrakingDistanceEstimator dryDriverCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVERONLY,
					BrakingConditions.BRAKES_COLD
			);

			BrakingDistanceEstimator wetDriverCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_WET,
					BrakingConditions.LOADING_DRIVERONLY,
					BrakingConditions.BRAKES_COLD
			);
			BrakingDistanceEstimator snowDriverCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_SNOW,
					BrakingConditions.LOADING_DRIVERONLY,
					BrakingConditions.BRAKES_COLD
			);
			BrakingDistanceEstimator dampDriverCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DAMP,
					BrakingConditions.LOADING_DRIVERONLY,
					BrakingConditions.BRAKES_COLD
			);

			assertTrue(dryDriverCold.getBrakingDistanceFor(40) < wetDriverCold.getBrakingDistanceFor(40));
			assertTrue(dryDriverCold.getBrakingDistanceFor(40) < dampDriverCold.getBrakingDistanceFor(40));
			assertTrue(dryDriverCold.getBrakingDistanceFor(40) < snowDriverCold.getBrakingDistanceFor(40));
			assertTrue(wetDriverCold.getBrakingDistanceFor(40) < snowDriverCold.getBrakingDistanceFor(40));
			assertTrue(dampDriverCold.getBrakingDistanceFor(40) < wetDriverCold.getBrakingDistanceFor(40));
			assertTrue(dampDriverCold.getBrakingDistanceFor(40) < snowDriverCold.getBrakingDistanceFor(40));


		} catch (InvalidBrakingConditionsException e) {
			fail(e);
		}
	}
	@Test
	void allPassCold () {
		try {
			BrakingDistanceEstimator dryPassCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_DRIVER_PASSENGER,
					BrakingConditions.BRAKES_COLD
			);

			BrakingDistanceEstimator wetPassCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_WET,
					BrakingConditions.LOADING_DRIVER_PASSENGER,
					BrakingConditions.BRAKES_COLD
			);
			BrakingDistanceEstimator snowPassCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_SNOW,
					BrakingConditions.LOADING_DRIVER_PASSENGER,
					BrakingConditions.BRAKES_COLD
			);
			BrakingDistanceEstimator dampPassCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DAMP,
					BrakingConditions.LOADING_DRIVER_PASSENGER,
					BrakingConditions.BRAKES_COLD

			);

			assertTrue(dryPassCold.getBrakingDistanceFor(40) < dampPassCold.getBrakingDistanceFor(40));
			assertTrue(dryPassCold.getBrakingDistanceFor(40) < wetPassCold.getBrakingDistanceFor(40));
			assertTrue(dryPassCold.getBrakingDistanceFor(40) < snowPassCold.getBrakingDistanceFor(40));
			assertTrue(dampPassCold.getBrakingDistanceFor(40) < wetPassCold.getBrakingDistanceFor(40));
			assertTrue(dampPassCold.getBrakingDistanceFor(40) < snowPassCold.getBrakingDistanceFor(40));
			assertTrue(wetPassCold.getBrakingDistanceFor(40) < snowPassCold.getBrakingDistanceFor(40));

		} catch (InvalidBrakingConditionsException e) {
			fail(e);
		}
	}
	@Test
	void allFullCold() {
		try {
			BrakingDistanceEstimator dryFullCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DRY,
					BrakingConditions.LOADING_FULL,
					BrakingConditions.BRAKES_COLD
			);

			BrakingDistanceEstimator wetFullCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_WET,
					BrakingConditions.LOADING_FULL,
					BrakingConditions.BRAKES_COLD
			);
			BrakingDistanceEstimator snowFullCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_SNOW,
					BrakingConditions.LOADING_FULL,
					BrakingConditions.BRAKES_COLD
			);
			BrakingDistanceEstimator dampFullCold = new BrakingDistanceEstimator(
					BrakingConditions.WEATHER_DAMP,
					BrakingConditions.LOADING_FULL,
					BrakingConditions.BRAKES_COLD
			);

			assertTrue(dryFullCold.getBrakingDistanceFor(40) < dampFullCold.getBrakingDistanceFor(40));
			assertTrue(dryFullCold.getBrakingDistanceFor(40) < wetFullCold.getBrakingDistanceFor(40));
			assertTrue(dryFullCold.getBrakingDistanceFor(40) < snowFullCold.getBrakingDistanceFor(40));
			assertTrue(dampFullCold.getBrakingDistanceFor(40) < wetFullCold.getBrakingDistanceFor(40));
			assertTrue(dampFullCold.getBrakingDistanceFor(40) < snowFullCold.getBrakingDistanceFor(40));
			assertTrue(wetFullCold.getBrakingDistanceFor(40) < snowFullCold.getBrakingDistanceFor(40));

		} catch (InvalidBrakingConditionsException e) {
			fail(e);
		}
	}
}

