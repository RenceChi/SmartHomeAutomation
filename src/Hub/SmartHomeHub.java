package Hub;

import Commands.Command;

public class SmartHomeHub {
    public void sendCommand(Command command) {
        command.execute();
    }
}
