import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Movie Ticket Booking System!");
        System.out.println("-------------------------------------------");

        Cinema cinema = new Cinema("Grand Cinema", 10);

        cinema.addMovie(1, "Inception", 2.5, "2025-02-01", "11:00 AM","01-01-2025");
        cinema.addMovie(2, "The Matrix", 2.0, "2025-02-01", "14:00 PM","03-01-2025");

        cinema.printMovies();



        //F1 - Primitive copy proof
        System.out.println("\n");
        System.out.println("F1 Primitive copy proof");
        double originalPrice = 12.00;
        double copyPrice = originalPrice;
        copyPrice = 15.00;

        System.out.println(""+ originalPrice);
        System.out.println(""+ copyPrice);

        //F2 - Reference copy prooof

        System.out.println("\nF2 Reference copy proof");

        Movie m1 = cinema.movies[0];
        Movie m2 = m1;            // reference copy
        m2.title = "Inception Updated";

        System.out.println("m1 title: " + m1.title);
        System.out.println("m2 title: " + m2.title);

        //F3 -Array stores reference proof
        System.out.println("\nF3 Array stores reference proof");

        m1.title = "Inception Final";
        System.out.println("Movie in cinema array: " + cinema.movies[0].title);


        //F4 - Snapshot proof 
        

       System.out.println("\nF4 Snapshot proof");

        Movie movieForTicket = cinema.movies[0];
        Customer customer = new Customer("Alice", "1234567890", true);

        Ticket ticket = new Ticket(1, movieForTicket, customer, 12.00, "VIP");

        movieForTicket.price = 20.00; 

        System.out.println("Ticket price snapshot: " + ticket.priceSnapshot);



        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();


        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter Secret Code to verify membership: ");
        int secretCodeInput = scanner.nextInt();

        Customer customer1 = new Customer(name, phoneNumber, false);

        if(customer1.member(secretCodeInput)){
            System.out.println("Welcome back, " + customer1.name + "! You are a verified member.");
            customer1.isMember = true;
        } else {
            System.out.println("Hello, " + customer1.name + ". You are not a member.");
        }

        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + customer1.name);
        System.out.println("Phone: " + customer1.phoneNumber);
        System.out.println("Is Member: " + customer1.isMember);


        System.out.println("Enter movie ID you want to watch: ");
        int chosenId = scanner.nextInt();
        Movie selectedMovie = cinema.findMovieById(chosenId);

        if (selectedMovie == null) {
            System.out.println("Movie not found!");
            return; // stop program safely
       }

        System.out.println("You selected: " + selectedMovie.title);
    }
             

}