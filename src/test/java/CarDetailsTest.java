import org.junit.Assert;
import org.junit.Test;

public class CarDetailsTest {

    // Happy path
    @Test
    public void getCarDetails_GivenValidCar_ReturnsExpectedString(){

        // Arrange
        Car car = new Car();
//        car.setMake("Ford");
//        car.setModel("Mustang");
//        car.setYear("2019");
        car.setColor("Blue");

        // Act
        String details = CarUtils.getCarDetails(car);

        // Assert
//        Assert.assertEquals("2019 Ford Mustang", details);
//        Assert.assertEquals("Blue", details);
    }

    @Test
    public void getCarDetails_GivenOneNullValue_ReturnsErrorString(){

        // Arrange
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
//        car.setYear("2019");
        // we did not set the year
        car.setColor("Blue");

        // Act
        String details = CarUtils.getCarDetails(car);

        // Assert
//        Assert.assertEquals("Not able to provide details", details);
        Assert.assertEquals("Blue", details);

    }

    @Test
    public void getCarDetails_GivenTwoNullValues_ReturnsErrorString(){

        // Arrange
        Car car = new Car();
        car.setMake("Ford");
//        car.setModel("Mustang");
//        car.setYear("2019");
        // we did not set the year
        // we did not set the model

        // Act
        String details = CarUtils.getCarDetails(car);

        // Assert
        Assert.assertEquals("Not able to provide details", details);
    }

    @Test
    public void setMileage(){

        // Arrange
        Car car = new Car();
        Car.setMileage("100");

        // Act
        double details = car.getMileage();

        // Assert
        Assert.assertEquals(0, details, 0);
    }

    public static void convertToElectric(){

    }
}
