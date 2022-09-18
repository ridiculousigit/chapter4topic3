package binar.academy.chapter4topic3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelProduct : ViewModel() {
    // Deklarasi Data
    val list = arrayListOf(
        DataProduct(
            "Fantech MAXFIT67",
            R.drawable.bg_keebs_maxfit67, 1299000,
            "❇️Hotswappable\n" +
                    "❇️Southfacing PCB\n" +
                    "❇️3 Mode Of Connection (Bluetooth 5.0 Up To 3 Device, 2.4 GHz Wireless Dongle, Wired)"
        ),
        DataProduct(
            "Vortex Series GT-6",
            R.drawable.bg_keebs_gt, 899000,
            "❇️Hotswappable\n" +
                    "❇️Southfacing PCB\n" +
                    "❇️3 Mode Of Connection (Bluetooth 5.0 Up To 3 Device, 2.4 GHz Wireless Dongle, Wired)"
        ),
        DataProduct(
            "Koodo Solar",
            R.drawable.bg_keebs_solar, 850000,
            "❇️Hotswappable\n" +
                    "❇️Southfacing PCB\n" +
                    "❇️3 Mode Of Connection (Bluetooth 5.0 Up To 3 Device, 2.4 GHz Wireless Dongle, Wired)"
        ),
        DataProduct(
            "DA Meca 6X Plus",
            R.drawable.bg_keebs_mecax, 520000,
            "❇️Hotswappable\n" +
                    "❇️Southfacing PCB\n" +
                    "❇️3 Mode Of Connection (Bluetooth 5.0 Up To 3 Device, 2.4 GHz Wireless Dongle, Wired)"
        )
    )

    // Mutable Live Data
    val product : MutableLiveData<List<DataProduct>> = MutableLiveData()

    // Set data ke Live Data
    fun getProduct() {
        product.value = list
    }

}