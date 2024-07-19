import java.util.Objects;

public class Laptop {
    private int rAM;
    private int hardDriveCapacity;
    private String operationSystem;
    private String color;

    public Laptop(int rAM, int hardDriveCapacity, String operationSystem, String color) {
        this.rAM = rAM;
        this.hardDriveCapacity = hardDriveCapacity;
        this.operationSystem = operationSystem;
        this.color = color;
    }

    public int getrAM() {
        return rAM;
    }

    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    public void setrAM(int rAM) {
        this.rAM = rAM;
    }

    public void setHardDriveCapacity(int hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override 
    public String toString() {
    return "RAM (gb): " + rAM + System.lineSeparator() + "Hard Drive Capacity (gb): " + hardDriveCapacity
    + System.lineSeparator() + "Operation System: " + operationSystem +
    System.lineSeparator() + "Color: "
    + color.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(rAM, hardDriveCapacity, operationSystem, color);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Laptop laptop = (Laptop) obj;
        return rAM == laptop.rAM && hardDriveCapacity == laptop.hardDriveCapacity
                && operationSystem.equals(laptop.operationSystem) && color.equals(laptop.color);
    }

}
