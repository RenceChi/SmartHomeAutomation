package Commands;

import Device.MusicPlayer;

public class PlayMusicCommand implements Command {
    private MusicPlayer player;
    public PlayMusicCommand(MusicPlayer player) { this.player = player; }
    public void execute() { player.play(); }
}
