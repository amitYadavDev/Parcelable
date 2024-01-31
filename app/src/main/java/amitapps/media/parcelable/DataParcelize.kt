package amitapps.media.parcelable

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataParcelize(
    val name: String?,
    val age: Int
) : Parcelable

