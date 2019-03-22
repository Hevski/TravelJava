public class Plane {

    private PlaneType plane;
    private int capacity;
    private int totalWeight;

    public Plane (PlaneType plane, int capacity, int totalWeight){
        this.plane = plane;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public PlaneType getPlane() {
        return plane;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setPlane(PlaneType plane) {
        this.plane = plane;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }
}
