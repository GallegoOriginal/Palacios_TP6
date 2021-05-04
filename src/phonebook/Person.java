/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

/**
 *
 * @author Wi7o
 */
public class Person {
   
    public String name;
    public String lastName;
    public String city;
    public String address;
    public int dni;
    public String phone;

    
    public Person(String name, String lastName, String city, String address, int dni, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.address = address;
        this.dni = dni;
        this.phone = phone;
    }
    
}
