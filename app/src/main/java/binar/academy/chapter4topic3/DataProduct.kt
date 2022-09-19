package binar.academy.chapter4topic3

import java.io.Serializable

data class DataProduct (
    var nameProduct : String,
    var imgProduct : Int,
    var priceProduct : Int,
    var stockProduct : Int,
    var descProduct : String
) : Serializable