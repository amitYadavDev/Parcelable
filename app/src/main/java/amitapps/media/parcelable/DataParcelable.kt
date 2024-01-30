package amitapps.media.parcelable

import android.os.Parcel
import android.os.Parcelable

data class DataParcelable(
    val name: String?,
    val age: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        p0.writeString(name)
        p0.writeInt(age)
    }

    companion object CREATOR : Parcelable.Creator<DataParcelable> {
        override fun createFromParcel(parcel: Parcel): DataParcelable {
            return DataParcelable(parcel)
        }

        override fun newArray(size: Int): Array<DataParcelable?> {
            return arrayOfNulls(size)
        }
    }

}
