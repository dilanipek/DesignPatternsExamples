package com.DesignPatterns.Creational.Builder.Example3;

import lombok.Builder;

@Builder
public class Address {

    private final int houseNumber;
    private final String street;
    private final String zipCode;
    private final String city;

}
