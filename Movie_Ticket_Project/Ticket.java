/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Ticket {
    int ticketId;

    Movie movie;
    Customer customer;
    double priceSnapshot;
    String ticketType;

    public Ticket(int ticketId, Movie movie, Customer customer, double price, String ticketType){
        this.ticketId = ticketId;
        this.movie = movie;
        this.customer = customer;
        this.priceSnapshot = price;
        this.ticketType = ticketType;
    }
    

}
