// Ariam Salazar
// Math-130
// Professor Raul Vargas
// May 13,2021

public class CargoShip extends Ship {

    // Fields
    private int cargo;

    // Setters & Getters
    public void setCargo(int c){
        this.cargo = c;
    }
    public int getCargo(){
        return this.cargo;
    }

    // Constructors
    public CargoShip(String n, int c){
        setName(n);
        setCargo(c);
    }
    public CargoShip(){
        setName("Voyager");
        setCargo(150000);
    }

    // toString()
    public String toString(){
        return String.format("This is a Cargoship called %s, and it holds %,d tons of cargo",getName(),this.cargo);
    }

}
