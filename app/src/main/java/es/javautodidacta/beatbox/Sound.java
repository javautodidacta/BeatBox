package es.javautodidacta.beatbox;

/**
 * This class handles wav sound files.
 *
 * @author Miguel Callejón Berenguer
 * @version 2018.01
 */

public class Sound {

    private String mAssetPath;
    private String mName;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
