package customermailapplication;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ntpsm
 */
public class CustomerFactory {
public static Customer createCustomer(String type) {
 switch(type) {
            case "Regular":
                return new RegularCustomer();
             
            case "Mountain":
                return new MountainCustomer();
                
            case "Delinquent":
                return new DelinquentCustomer();
                
        }
    return null;

}
}
