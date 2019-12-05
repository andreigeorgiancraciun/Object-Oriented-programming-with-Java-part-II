
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    
    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bird)) {
            return false;
        }
 
        Bird bird = (Bird) o;
 
        if (this.latinName == null) {
            return false;
        }

        return this.latinName.equals(bird.latinName) && this.ringingYear == bird.ringingYear;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.latinName != null ? this.latinName.hashCode() : 0);
        hash = 59 * hash + this.ringingYear;
        return hash;
    }

}
