// Ariam Salazar
// Math-130
// Professor Raul Vargas
// May 13,2021

public class CruiseShip extends Ship{

    // Fields
    private int passengers;

    // Setters & Getters
    public void setPassengers(int p){
        this.passengers = p;
    }
    public int getPassengers(){
        return this.passengers;
    }

    // Constructors
    public CruiseShip(String n, int p){
        setName(n);
        setPassengers(p);
    }
    public CruiseShip(){
        setName("Voyager");
        setPassengers(250);
    }
    

    // toString()
    public String toString(){
        return String.format("This is a Cruiseship called %s, and it holds %,d passengers", getName(), this.passengers);
    }
}
