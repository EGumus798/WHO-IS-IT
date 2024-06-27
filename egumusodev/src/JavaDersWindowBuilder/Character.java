package JavaDersWindowBuilder;

public class Character {
    private String name;
    private boolean isFemale;
    private boolean hasGlasses;
    private boolean hasBeard;
    private boolean hasHat;
    private boolean isBlonde;

    public Character(String name, boolean isFemale, boolean hasGlasses, boolean hasBeard, boolean hasHat, boolean isBlonde) {
        this.name = name;
        this.isFemale = isFemale;
        this.hasGlasses = hasGlasses;
        this.hasBeard = hasBeard;
        this.hasHat = hasHat;
        this.isBlonde = isBlonde;
    }

    
    public String getName() {
        return name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean hasGlasses() {
        return hasGlasses;
    }

    public boolean hasBeard() {
        return hasBeard;
    }

    public boolean hasHat() {
        return hasHat;
    }

    public boolean isBlonde() {
        return isBlonde;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setFemale(boolean isFemale) {
        this.isFemale = isFemale;
    }

    public void setGlasses(boolean hasGlasses) {
        this.hasGlasses = hasGlasses;
    }

    public void setBeard(boolean hasBeard) {
        this.hasBeard = hasBeard;
    }

    public void setHat(boolean hasHat) {
        this.hasHat = hasHat;
    }

    public void setBlonde(boolean isBlonde) {
        this.isBlonde = isBlonde;
    }
}