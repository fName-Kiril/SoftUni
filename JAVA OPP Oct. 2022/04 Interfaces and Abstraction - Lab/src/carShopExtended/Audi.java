package carShopExtended;

public class Audi extends CarImpl implements Rentable {

    private Integer minRentDay;
    private Double pricePerDay;


    public Audi(String model, String color, Integer horsePower,
                String countryProduced, Integer minRentDay, Double pricePerDay) {

        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }


    @Override
    public Integer getMinRentDay() {
        return this.getMinRentDay();
    }

    @Override
    public Double getPricePerDay() {
        return this.getPricePerDay();
    }
    public String toString(){
        return String.format("This is %s produced in %s and have %d tires\n" +
                        "Minimum rental period of %d days. Price per day %f",
                getModel(), this.countryProduced(), TIRES, minRentDay, pricePerDay);
    }
}
