package com.example.superheroeswiki.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class HeroImage(
    @SerializedName("sm")
    val url: String
) : Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString()!!)

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(url)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HeroImage> {
        override fun createFromParcel(parcel: Parcel): HeroImage {
            return HeroImage(parcel)
        }

        override fun newArray(size: Int): Array<HeroImage?> {
            return arrayOfNulls(size)
        }
    }

}
