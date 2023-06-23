package com.nalandya.ppdbtracker.model


import com.google.gson.annotations.SerializedName

data class Sekolah(
    @SerializedName("is_negeri")
    val isNegeri: Boolean? = null,
    @SerializedName("is_sbi")
    val isSbi: Boolean? = null,
    @SerializedName("k_kota")
    val kKota: Int? = null,
    @SerializedName("k_propinsi")
    val kPropinsi: Int? = null,
    @SerializedName("kota")
    val kota: String? = null,
    @SerializedName("nama")
    val nama: String? = null,
    @SerializedName("npsn")
    val npsn: String? = null,
    @SerializedName("propinsi")
    val propinsi: String? = null,
    @SerializedName("sekolah_id")
    val sekolahId: String? = null,
    @SerializedName("siap_id")
    val siapId: String? = null
)