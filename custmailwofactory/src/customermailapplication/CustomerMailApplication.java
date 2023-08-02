/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;
/**
 *
 * @author sarun
 */
public class CustomerMailApplication {
private Customer customer;
     public String generateMail() {
        return customer.createMail();
    }
     
    public static void main(String[] args) {
       
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        Customer Cus = CustomerFactory.createCustomer("");
     
        switch(type) {
            case 1:
             
                Cus = CustomerFactory.createCustomer("Regular");
                break;
            case 2:
               
                Cus = CustomerFactory.createCustomer("Mountain");
                break;
            case 3:
               
                Cus = CustomerFactory.createCustomer("Delinquent");
                break;
            
        }
        System.out.println(Cus.createMail());
                
       
    }
        
}
