package Exercise_01_WorkingWithAbstractions.P04_TrafficLights;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] initialTrafficLightsState = reader.readLine().split("\\s+");

        int numberOFUpdates = Integer.parseInt(reader.readLine());

        List<TrafficLight> trafficLights =
                Arrays.stream(initialTrafficLightsState).map(s -> new TrafficLight(TrafficLightState.valueOf(s))).collect(Collectors.toList());

        for (int i = 0; i < numberOFUpdates; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight + " ");
            }
            System.out.println();
        }
    }
}
