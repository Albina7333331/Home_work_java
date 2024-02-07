
public class Laptop {
    String brend;
    String RAM;
    String HDD;
    String OS;
    String Colour;
    @Override
    public String toString(){
        return "brend: " + brend + ", RAM: " + RAM + ", HDD: " + HDD + ", OS: " + OS + ", Colour: " + Colour;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Laptop)){
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return brend.equals(laptop.brend) && RAM.equals(laptop.RAM) && HDD.equals(laptop.HDD) && OS.equals(laptop.OS) && Colour.equals(laptop.Colour);
    }
    @Override
    public int hashCode(){
        return brend.hashCode() + 19*RAM.hashCode() + 7*HDD.hashCode() + 13*OS.hashCode() + 17*Colour.hashCode();
    }
}
