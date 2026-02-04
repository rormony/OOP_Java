/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Cinema {
    String name;
    Movie[] movies ;
    Showtime[] showtimes;
    int menuCount=0;
    int movieCount = 0;


    public Cinema(String name, int maxMovies){
        this.name = name;
        movies = new Movie[maxMovies];
        showtimes = new Showtime[maxMovies];
      
        menuCount = 0;
    }
    public void addMovie(int id, String title, double duration, String date, String time, String releaseDate){
        Movie movie = new Movie(id, title, duration, releaseDate);
        movies[menuCount] = movie;

        Showtime showtime = new Showtime(time, date, menuCount + 1, movies);
        showtimes[menuCount] = showtime;

        menuCount++;
        
    }
    

    public void printMovies(){
        System.out.println("Movies in " + name + ":");
        for(int i=0; i<menuCount; i++){
            System.out.println("Movie Id:" + movies[i].id + ", Title: " + movies[i].title + ", Duration: " + movies[i].duration + "h, Date: " + showtimes[i].date + ", Time: " + showtimes[i].time + ", Release Date: " + movies[i].releaseDate);
        }
    }
    Movie findMovieById(int id) {
      
        for (int i = 0; i < menuCount; i++) {
            if (movies[i].id == id) {
                return movies[i];
            }
        }
        return null; 
    }

}

