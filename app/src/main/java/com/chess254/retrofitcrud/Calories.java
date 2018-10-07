package com.chess254.retrofitcrud;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chess on 10/7/2018.
 */

public class Calories {

    @SerializedName("name")
    private String Name;

    @SerializedName("calories")
    private int Calories;

    public String getName() {
        return Name;
    }

    public int getCalories() {
        return Calories;
    }

    public String getImage_Path() {
        return Image_Path;
    }

    @SerializedName("image_path")
    private String Image_Path;


}
