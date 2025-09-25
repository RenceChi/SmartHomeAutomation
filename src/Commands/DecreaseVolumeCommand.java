package Commands;

import Device.MusicPlayer;

public class DecreaseVolumeCommand implements Command {
    private MusicPlayer player;
    public DecreaseVolumeCommand(MusicPlayer player) { this.player = player; }
    public void execute() { player.decreaseVolume(); }
}
