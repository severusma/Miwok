package com.example.android.miwok;

/**
 * Created by Xiaoqian on 4/22/17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageRescourseId = NO_IMAGE_PROVIDED;
    private int mSoundRescourseId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int soundRescourseId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundRescourseId = soundRescourseId;
    }

    public Word(String defaultTranslation, String miwokTranslation,
                int ImageRescourseId, int soundRescourseId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageRescourseId = ImageRescourseId;
        mSoundRescourseId = soundRescourseId;
    }
    public String getDefaultTraslation(){

        return this.mDefaultTranslation;
    }

    public String getMiwokTranslation(){

        return this.mMiwokTranslation;
    }

    public int getImageResourceId() {

        return this.mImageRescourseId;
    }

    public int getSoundRescourseId() {

        return this.mSoundRescourseId;
    }

    public boolean hasImage() {

        return mImageRescourseId != NO_IMAGE_PROVIDED;
    }
}
