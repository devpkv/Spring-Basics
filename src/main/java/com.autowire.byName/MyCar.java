package com.autowire.byName;

public class MyCar {

    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public String getCarDetails()
    {
        return  specification.toString();
    }
}
