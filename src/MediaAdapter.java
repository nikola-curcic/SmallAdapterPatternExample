/**
 * Created by nikola on 12.7.17..
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedPlayer;


    public MediaAdapter (String audioType)
    {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedPlayer = new VlcPlayer();
        else
            advancedPlayer = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc"))
            advancedPlayer.playVlc(fileName);
        else
            advancedPlayer.playMp4(fileName);
    }


}
