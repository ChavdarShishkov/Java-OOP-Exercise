package Exercise_01_WorkingWithAbstractions.P04_TrafficLights;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight(TrafficLightState state) {
        this.state = state;
    }

    public void update() {
        switch (this.state) {
            case RED -> this.state = TrafficLightState.GREEN;
            case GREEN -> this.state = TrafficLightState.YELLOW;
            case YELLOW -> this.state = TrafficLightState.RED;
        }
    }

    @Override
    public String toString() {
        return this.state.name();
    }
}
