package com.desingpattern.structural.adapter;

//import java.io.OutputStreamWriter

public class Test {
    public static void main(String[] args) {
        //class adapter test
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
        System.out.println("*****************");

        //object adapter test
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);

        System.out.println(card);

    }

    public static void populateEmployeeData(Employee employee) {
        employee.setFullName("Dilan İpek");
        employee.setJobTitle("Software Developer");
        employee.setOfficeLocation("HomeOffice");
    }


}
