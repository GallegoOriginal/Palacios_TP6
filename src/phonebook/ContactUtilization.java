/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.ArrayList;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Wi7o
 */
public class ContactUtilization {

    /**
     * @return the MessageStatus
     */
    private static final Map<String, Person> map
            = new HashMap<>();
    
    public void agregarCliente(String name, String lastName, String city, String address, int dni, String phone){
        Person contact = new Person(name, lastName, city, address, dni, phone);
        map.put(phone, contact);
        List<Person> list = new ArrayList<Person>(map.values());
    }
    
     public List<Person> todosContactos (){
        List<Person> list = new ArrayList<Person>(map.values());
        return list;
    }
    
    public List<Person> buscarCliente(String lastName){
        List<Person> list = new ArrayList<Person>();
        for (Map.Entry<String, Person> a : map.entrySet()) {
        Person person = a.getValue();
        if (person.lastName.equals(lastName)) {
            list.add(person);
        }
        } 
        return list;
    }
    
    public List<Person> buscarTeléfono (String phone){
        List<Person> list = new ArrayList<Person>(); 
        list.add(map.get(phone));
        return list;
    }
    
    public List<Person> buscarClientes(String city){
        List<Person> list = new ArrayList<Person>();
        for (Map.Entry<String, Person> a : map.entrySet()) {
        Person person = a.getValue();
        if (person.city.equals(city)) {
            list.add(person);
        }
        } 
        return list;
    }
    
    public void borrarCliente(int dni){
        List<Person> list = new ArrayList<>();
        for (Map.Entry<String, Person> a : map.entrySet()) {
        Person person = a.getValue();
        if (person.dni == dni) {
            map.remove(a.getKey());
        }
        } 
    }
}
