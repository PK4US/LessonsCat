package com.pk4us.cryptoapp.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinInfoListOfData(
    @SerializedName("data")
    @Expose
    val data:List<Datum>? = null
)
