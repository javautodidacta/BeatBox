package es.javautodidacta.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * This class is the View Model between
 * the View ({@code list_item_model.xml}) and the Model ({@link Sound}).
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.01
 */

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
