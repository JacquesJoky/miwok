package com.example.android.miwok;

/**
 * Created by jacquesjoky on 1/3/17.
 * {@link Word}Represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Creates a new Word object
     *
     * @param defaultTranslation is the translation of the word in the default language (English)
     * @param miwokTranslation is the translation of the word in the Miwok language
     * @param audioResourceId is the raw resource id for the audio file associated with the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Creates a new Word object
     *
     * @param defaultTranslation is the translation of the word in the default language (English)
     * @param miwokTranslation is the translation of the word in the Miwok language
     * @param imageResourceId is the drawable resource id for the image associated with the word
     * @param audioResourceId is the raw resource id for the audio file associated with the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Gets the default translation of the word
     * @return the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Gets the miwok translation of the word
     * @return the miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Gets the resource Id of the image
     * @return the resource Id of the image
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Gets the resource Id of the audio file
     * @return the resource Id of the audio file
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Checks whether the word has an image attached
     * @return whether the word has an image attached
     */
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
