package com.example.miwork2;

public class Word {
     /** Deault translation for the word */
    private String mDeaultTranslation;

    /** Miwok Translation for word */
    private String mMiwokTranslation ;

    // constuctor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDeaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    /** Get the Default translation of the word */
    public String getmDeaultTranslation() {
        return mDeaultTranslation;
    }
    /** Get the Miwok Translation of the Word */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
