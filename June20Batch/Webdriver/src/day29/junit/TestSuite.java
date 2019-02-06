package day29.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({Login.class,
	           FlightDetails.class,
	           SelectFlight.class,
	           BookFlight.class,
	           FlightConfirmation.class})


public class TestSuite {

}









