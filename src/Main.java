

import Device.*;
import Commands.*;
import Hub.SmartHomeHub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Devices
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer player = new MusicPlayer();

        // Hub
        SmartHomeHub hub = new SmartHomeHub();

        boolean running = true;
        while (running) {
            System.out.println("\n=== SMART HOME MAIN MENU ===");
            System.out.println("1. Control Light");
            System.out.println("2. Control Thermostat");
            System.out.println("3. Control Music Player");
            System.out.println("0. Exit");
            System.out.print("Choose a device: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n--- Light Menu ---");
                    System.out.println("1. Turn ON");
                    System.out.println("2. Turn OFF");
                    int c = scanner.nextInt();
                    if (c == 1) hub.sendCommand(new LightOnCommand(light));
                    else if (c == 2) hub.sendCommand(new LightOffCommand(light));
                }
                case 2 -> {
                    System.out.println("\n--- Thermostat Menu ---");
                    System.out.println("1. Increase Temperature");
                    System.out.println("2. Decrease Temperature");
                    int c = scanner.nextInt();
                    if (c == 1) hub.sendCommand(new IncreaseTempCommand(thermostat));
                    else if (c == 2) hub.sendCommand(new DecreaseTempCommand(thermostat));
                }
                case 3 -> {
                    System.out.println("\n--- Music Player Menu ---");
                    System.out.println("1. Play Music");
                    System.out.println("2. Stop Music");
                    System.out.println("3. Increase Volume");
                    System.out.println("4. Decrease Volume");
                    int c = scanner.nextInt();
                    if (c == 1) hub.sendCommand(new PlayMusicCommand(player));
                    else if (c == 2) hub.sendCommand(new StopMusicCommand(player));
                    else if (c == 3) hub.sendCommand(new IncreaseVolumeCommand(player));
                    else if (c == 4) hub.sendCommand(new DecreaseVolumeCommand(player));
                }
                case 0 -> {
                    running = false;
                    System.out.println("Exiting Smart Home...");
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
