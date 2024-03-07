public class Eagle implements Fly {
    private int altitude = 0;

    @Override
    public void takeOff() {
        System.out.println("Hawkeye takes off in the sky.");
    }

    @Override
    public int ascend(int meters) {
        altitude += meters;
        System.out.println("Hawkeye flies upward, altitude: " + altitude);
        return altitude;
    }

    @Override
    public int descend(int meters) {
        altitude -= meters;
        System.out.println("Hawkeye flies downward, altitude: " + altitude);
        return altitude;
    }

    @Override
    public void glide() {
        System.out.println("Glides into the air.");
    }

    @Override
    public void land() {
        if (altitude > 1) {
            System.out.println("Hawkeye is too high, it can't land.");
        } else {
            System.out.println("Hawkeye lands on the ground.");
        }
    }
}
