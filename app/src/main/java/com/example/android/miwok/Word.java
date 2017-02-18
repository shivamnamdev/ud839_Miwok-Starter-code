package com.example.android.miwok;

/**
 * Created by Shivam Namdev on 03-02-2017.
 */

public class Word {
    private String englishWord;

    private String paraDescp;

    public Word(String cString, String pString)
    {
        englishWord = cString;
        paraDescp = pString;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getParaDescp() {
        return paraDescp;
    }



}
