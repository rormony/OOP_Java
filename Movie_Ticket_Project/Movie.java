public class Movie{
    int id;
    String title;
    double duration;

    public Movie(int id, String title, double duration){
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie(01, "jjjjjj", 2.5);
        System.out.println("Movie Id:" + movie1.id + ", Title: " + movie1.title + ", Duration: " + movie1.duration + " hours" );
    }
}