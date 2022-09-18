package binar.academy.chapter4topic3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelProduct : ViewModel() {

    val list = arrayListOf(
        DataProduct("Gayung", R.drawable.ic_launcher_background, "$50", 5, "Haha"),
        DataProduct("TV", R.drawable.ic_launcher_background, "$70", 5, "Haha"),
        DataProduct("Rumah", R.drawable.ic_launcher_background, "$40", 5, "Haha"),
        DataProduct("Jabatan", R.drawable.ic_launcher_background, "$10", 5, "Haha")
    )

    val product : MutableLiveData<List<DataProduct>> = MutableLiveData()

    fun getProduct() {
        product.value = list
    }

}