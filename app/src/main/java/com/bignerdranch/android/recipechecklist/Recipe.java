package com.bignerdranch.android.recipechecklist;

/**
 * Created by Dymyll on 2/25/2018.
 */

public class Recipe {

    private String mfood;
    private boolean mChecked;

    public void Grocery(String food){
        mfood = food;
    }

    public void setChecked(boolean solved){
        mChecked = solved;
    }
}
