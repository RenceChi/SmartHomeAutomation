package Commands;

import Device.Thermostat;

public class DecreaseTempCommand implements Command {
    private Thermostat thermostat;
    public DecreaseTempCommand(Thermostat thermostat) { this.thermostat = thermostat; }
    public void execute() { thermostat.decreaseTemperature(); }
}
