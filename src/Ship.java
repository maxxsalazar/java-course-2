// Ariam Salazar
// Math-130
// Professor Raul Vargas
// May 13,2021

public class Ship {
    
    // Fields
    private String name;
    private int year;

    // Setters & Getters
    public void setName(String n){
        this.name = n;
    }
    public void setYear(int y){
        this.year = y;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }

    // Constructors
    public Ship(String n, int y){
        setName(n);
        setYear(y);
    }
    public Ship(){
        setName("Voyager");
        setYear(1995);
    }

    // toString()
    public String toString(){
        return String.format("The ship is called %s, and it was built in the year %d", this.name,this.year);
    }


    
}
