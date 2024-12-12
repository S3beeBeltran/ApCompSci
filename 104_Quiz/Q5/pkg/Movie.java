package pkg;

public class Movie{


    String movieName;
    Double rating;
    int numRating;
    int revenue;
    

public Movie(){
    movieName = "Manchester by the Sea";
    rating = 9.2;
    numRating = 21;
    revenue = 294000000;
}
public Movie(String name, double rat, int numrat, int rev){
    movieName = name;
    rating = rat;
    numRating = numrat;
    revenue = rev;
}
public void movieToString(){
  movieName = movieName;
  rating = rating;
  numRating = numRating;
  revenue = revenue;
  return;
}
public String getMovieName(){
    return movieName;
}
public int getRevenue(){
   return revenue;
}
public void addRating(double a){
    rating = rating * numRating;
    rating = rating + a;
    numRating = numRating + 1;
    rating = rating/ numRating;
}
}
