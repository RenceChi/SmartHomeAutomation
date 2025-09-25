package Commands;

import Device.MusicPlayer;

public class IncreaseVolumeCommand implements Command {
    private MusicPlayer player;
    public IncreaseVolumeCommand(MusicPlayer player) { this.player = player; }
    public void execute() { player.increaseVolume(); }
}
