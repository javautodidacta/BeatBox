package es.javautodidacta.beatbox;

import android.support.v4.app.Fragment;

/**
 * This class hosts the {@link BeatBoxFragment}.
 */

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
