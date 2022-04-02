package com.DesignPatterns.Creational.Builder.Example3;

import java.util.List;

public class App {
    public static void main(String[] args) {

      Name name=  new Name.Builder().firstName("Dilan")
                .middleNames(List.of("Jennifer","Rihanna")).surname("ipek").build();

      Address address= new Address.AddressBuilder()
              .city("İzmir").street("Ata").houseNumber(18).zipCode("35353")
              .build();

      Account account= new Account.Builder().address(address).name(name)
              .email("dilan@ipekk@gmail.com").build();

        System.out.println("Account infos: "+"\n"+ "name:" + account.getName() + ","+"address"+account.getAddress().toString());
    }
}
