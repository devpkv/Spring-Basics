package car.constructor.injection;

public class MyCar {

    private Specification specification;

    public MyCar(Specification specification) {
        this.specification = specification;
    }

    public String getCarDetails()
    {
        return  specification.toString();
    }
}
