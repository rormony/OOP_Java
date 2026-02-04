

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Customer {

    String name;
    String phoneNumber;
    boolean isMember;
    int secretCode = 1234;

    public Customer(String name, String phoneNumber, boolean isMember){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isMember = isMember;
    }

    public boolean member(int code){
        if (code == secretCode){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        
      }




}
