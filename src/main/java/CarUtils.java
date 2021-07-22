public class CarUtils {

    //    public static String getCarDetails(Car car){
//
//        String make = car.getMake();
//        String model = car.getModel();
//        String year = car.getYear();
//
//        if(make == null || model == null || year == null) {
//            return "Not able to provide details";
//        }
//
//        return year + " " +  make + " " + model;
//
//
//    }
    public static String getCarDetails(Car car) {

//    String make = car.getMake();
//    String model = car.getModel();
//    String year = car.getYear();
        String color = car.getColor();


//        if (car.getMake() == null || car.getModel() == null || car.getYear() == null) {
//            return "Not able to provide details";
//        }
//
//        return car.getYear() + " " + car.getMake() + " " + car.getModel();
//
//    }
        if (car.getColor() == null) {

        }
        return car.getColor();
    }

    public static void addToMileage(double mileage) {
        Car car = new Car();
        double mileageToAdd = mileage;

        mileage = 0;

    }

    public static void convertToElectric(Car car, String engineType){
//        Car car1 = new Car();
//        String engineType = car.isElectric();
//        boolean engineType = car.isElectric();

        if(engineType.contains("electric")){
            car.setElectric(true);
        }else{
            car.setElectric(false);
        }

    }
}
