/**
 * Created by nikola on 12.7.17..
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter adapter;
    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4"))
        {
            adapter = new MediaAdapter(audioType);
            adapter.play(audioType, fileName);
        }
        else
        {
            System.out.println("Ovaj format nije podrzan!");
        }
    }
}
