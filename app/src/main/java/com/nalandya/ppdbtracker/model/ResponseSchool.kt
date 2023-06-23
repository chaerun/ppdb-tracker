package com.nalandya.ppdbtracker.model


import com.google.gson.annotations.SerializedName

data class ResponseSchool(
    @SerializedName("data")
    val data: List<List<Any?>?>? = null,
    @SerializedName("enable")
    val enable: Boolean? = null,
    @SerializedName("jml_luar")
    val jmlLuar: Int? = null,
    @SerializedName("jml_pagu")
    val jmlPagu: String? = null,
    @SerializedName("kompetensi")
    val kompetensi: String? = null,
    @SerializedName("rekap")
    val rekap: List<Any?>? = null,
    @SerializedName("rows_per_page")
    val rowsPerPage: Int? = null,
    @SerializedName("sekolah")
    val sekolah: Sekolah? = null,
    @SerializedName("signature")
    val signature: String? = null
)