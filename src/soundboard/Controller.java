package soundboard;

import javafx.event.Event;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class Controller {

    public void playSoundOne(Event event) {
        String musicFile = "audio/bat.wav"; // Path relative to root
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.3); // 30% volume
        mediaPlayer.play();
    }

}
