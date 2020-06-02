package stereo;

import stereo.components.CassetteDeck;
import stereo.components.CdPlayer;
import stereo.components.Radio;
import stereo.components.RecordDeck;

public class Stereo {
    public String name;
    CdPlayer cdplayer;
    Radio radio;
    RecordDeck recordDeck;
    CassetteDeck cassetteDeck;

    public Stereo(String name, CdPlayer cdplayer, Radio radio, RecordDeck recordDeck, CassetteDeck cassetteDeck) {
        this.name = name;
        this.cdplayer = cdplayer;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.cassetteDeck = cassetteDeck;
    }

    public String getName() {
        return name;
    }

    public CdPlayer getCdplayer() {
        return cdplayer;
    }

    public Radio getRadio() {
        return radio;
    }

    public RecordDeck getRecordDeck() {
        return recordDeck;
    }

    public CassetteDeck getCassetteDeck() {
        return cassetteDeck;
    }

    public String tuneRadio(String radioChannel){
      return this.radio.tune(radioChannel);
    }

}
