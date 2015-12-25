package soundboard;

import javafx.event.Event;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Controller {

    public void playSoundOne(Event event) {

        Media sound = new Media(getClass().getResource("/audio/bat.wav").toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(0.3); // 30% volume
        mediaPlayer.play();
    }

}
