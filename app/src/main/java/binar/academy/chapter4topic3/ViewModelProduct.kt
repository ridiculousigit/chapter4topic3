package binar.academy.chapter4topic3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelProduct : ViewModel() {
    // Deklarasi Data
    val list = arrayListOf(
        DataProduct(
            "Fantech MAXFIT67 - Mechanical Keyboard 65% w/ Knob Layout - Outemu Switch",
            R.drawable.bg_keebs_maxfit67, 1299000, 80,
            "❇️ Hotswappable\n" +
                    "❇️ Southfacing PCB\n" +
                    "❇️ 3 Mode Of Connection"
        ),
        DataProduct(
            "Vortex Series GT-6 - Mechanical Keyboard 65% w/ Knob Layout - Outemu Switch",
            R.drawable.bg_keebs_gt, 899000, 120,
            "❇️ Hotswappable\n" +
                    "❇️ Southfacing PCB\n" +
                    "❇️ 3 Mode Of Connection"
        ),
        DataProduct(
            "Koodo Solar - Mechanical Keyboard 75% w/ Knob Layout - Outemu Switch",
            R.drawable.bg_keebs_solar, 850000, 60,
            "❇️ Hotswappable\n" +
                    "❇️ Southfacing PCB\n" +
                    "❇️ 3 Mode Of Connection"
        ),
        DataProduct(
            "DA Meca 6X Plus - Mechanical Keyboard 65% w/ Knob Layout - Outemu Switch",
            R.drawable.bg_keebs_mecax, 520000, 250,
            "❇️ Hotswappable\n" +
                    "❇️ Southfacing PCB\n" +
                    "❇️ 3 Mode Of Connection"
        )
    )

    // Mutable Live Data
    val product : MutableLiveData<List<DataProduct>> = MutableLiveData()

    // Set data ke Live Data
    fun getProduct() {
        product.value = list
    }

}