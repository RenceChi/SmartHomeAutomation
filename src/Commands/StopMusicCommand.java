package Commands;

import Device.MusicPlayer;

public class StopMusicCommand implements Command {
    private MusicPlayer player;
    public StopMusicCommand(MusicPlayer player) { this.player = player; }
    public void execute() { player.stop(); }
}
