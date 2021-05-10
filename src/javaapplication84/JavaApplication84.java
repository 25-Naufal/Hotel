/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication84;

import java.util.Scanner;

/**
 *
 * @author ASUS X450JN
 */
public class JavaApplication84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Setgetjava java = new Setgetjava();
        
        
        String[] room = {"bla","Grand Ohm Room","Luxury Room","Downbad Room"};
      int[] harga =  {100,1100000, 700000, 280000};
      int pilih,bayar,noktp,jumlah;
      String nama;
        
      Scanner input = new Scanner(System.in);
      
      System.out.println("-- Welcome to Downtown Hotel --");
      System.out.println("------------------------------");
        
        System.out.println("Please input your data");
        System.out.print("Name : ");
        java.setNama(input.next());
        
        System.out.print("Your identity number :");
        noktp = input.nextInt();
        System.out.println("-------------------------------");
          
          System.out.println("This is the service we provide in our hotel.");
      for (int i=1; i<harga.length;i++){
          System.out.println(i+". "+room[i]+" : Rp."+harga[i]);
      }
        
      System.out.print("Please choose your selection room = ");
        pilih = input.nextInt();
        
        switch (pilih) {
            case 1:
                System.out.println("Your order : "+room[pilih]);
                System.out.println("");
                System.out.print("How many room would you get? = ");
                jumlah = input.nextInt();
                int rum = jumlah * 1100000;
                System.out.println("The total is gonna be Rp."+rum);
                System.out.print("Please input your balance = Rp.");
                bayar = input.nextInt();
        if(bayar > rum & jumlah == 1){
            System.out.println("-----------------");
            System.out.println("-- Receipt --");
            System.out.println("Your change Rp."+(bayar - rum));
            System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
            System.out.println("Your room number is 408");
            System.out.println("-----------------");
        }else if (bayar == rum & jumlah == 1){
             System.out.println("-----------------");
             System.out.println("-- Receipt --");
             System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
             System.out.println("Your room number is 408");
             System.out.println("-----------------");
        }else if(bayar > rum & jumlah == 2){
            System.out.println("-----------------");
            System.out.println("-- Receipt --");
            System.out.println("Your change Rp."+(bayar - rum));
            System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
            System.out.println("Your room number is 408 and 409");
            System.out.println("-----------------");
        }else if (bayar == rum & jumlah == 2 ){
             System.out.println("-----------------");
             System.out.println("-- Receipt --");
             System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
             System.out.println("Your room number is 408 and 409");
             System.out.println("-----------------");
        }else{
            System.out.println("-----------------");
            System.out.println("Sorry, your balance is incuffient");
            System.out.println("-----------------");
        }
                
        break;
            case 2:
        System.out.println("Your order : "+room[pilih]);
                System.out.println("");
                System.out.print("How many room would you get? = ");
                jumlah = input.nextInt();
                rum = jumlah * 700000;
                System.out.println("The total is gonna be Rp."+rum);
                System.out.print("Please input your balance = Rp.");
                bayar = input.nextInt();
        if(bayar > rum & jumlah == 1){
            System.out.println("-----------------");
            System.out.println("-- Receipt --");
            System.out.println("Your change Rp."+(bayar - rum));
            System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
            System.out.println("Your room number is 308");
            System.out.println("-----------------");
        }else if (bayar == rum & jumlah == 1){
             System.out.println("-----------------");
             System.out.println("-- Receipt --");
             System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
             System.out.println("Your room number is 308");
             System.out.println("-----------------");
        }else if(bayar > rum & jumlah == 2){
            System.out.println("-----------------");
            System.out.println("-- Receipt --");
            System.out.println("Your change Rp."+(bayar - rum));
            System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
            System.out.println("Your room number is 308 and 309");
            System.out.println("-----------------");
        }else if (bayar == rum & jumlah == 2 ){
             System.out.println("-----------------");
             System.out.println("-- Receipt --");
             System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
             System.out.println("Your room number is 308 and 309");
             System.out.println("-----------------");
        }else{
            System.out.println("-----------------");
            System.out.println("Sorry, your balance is incuffient");
            System.out.println("-----------------");
        }
        
        break;
            case 3:
        System.out.println("Your order : "+room[pilih]);
                System.out.println("");
                System.out.print("How many room would you get? = ");
                jumlah = input.nextInt();
                rum = jumlah * 280000;
                System.out.println("The total is gonna be Rp."+rum);
                System.out.print("Please input your balance = Rp.");
                bayar = input.nextInt();
        if(bayar > rum & jumlah == 1){
            System.out.println("-----------------");
            System.out.println("-- Receipt --");
            System.out.println("Your change Rp."+(bayar - rum));
            System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
            System.out.println("Your room number is 108");
            System.out.println("-----------------");
        }else if (bayar == rum & jumlah == 1){
             System.out.println("-----------------");
             System.out.println("-- Receipt --");
             System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
             System.out.println("Your room number is 108");
             System.out.println("-----------------");
        }else if(bayar > rum & jumlah == 2){
            System.out.println("-----------------");
            System.out.println("-- Receipt --");
            System.out.println("Your change Rp."+(bayar - rum));
            System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
            System.out.println("Your room number is 108 and 109");
            System.out.println("-----------------");
        }else if (bayar == rum & jumlah == 2 ){
             System.out.println("-----------------");
             System.out.println("-- Receipt --");
             System.out.println("Thank you for staying at our hotel "+java.getNama()+"!");
             System.out.println("Your room number is 108 and 109");
             System.out.println("-----------------");
        }else{
            System.out.println("-----------------");
            System.out.println("Sorry, your balance is incuffient");
            System.out.println("-----------------");
        }
        break;
        }
    
       
                
    }
    
    
    
      
    
}
    
    
