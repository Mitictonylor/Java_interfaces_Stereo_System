package stereo;

import stereo.components.CassetteDeck;
import stereo.components.CdPlayer;
import stereo.components.Radio;
import stereo.components.RecordDeck;

public class Stereo {
    private String name;
    private CdPlayer cdplayer;
    private Radio radio;
    private RecordDeck recordDeck;
    private CassetteDeck cassetteDeck;
    private int volume;


    public Stereo(String name, CdPlayer cdplayer, Radio radio, RecordDeck recordDeck, CassetteDeck cassetteDeck, int volume) {
        this.name = name;
        this.cdplayer = cdplayer;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.cassetteDeck = cassetteDeck;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public String tuneRadio(String radioChannel){
      return "Radio chose is " + this.radio.tune(radioChannel);
    }
    public String playCd(){
        return this.cdplayer.play();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void raiseVolume(){
        this.setVolume((this.getVolume() +1));
    }
    public void lowVolume(){
        if (this.volume >= 1){
        this.setVolume((this.getVolume() -1));
    }
    }
}
