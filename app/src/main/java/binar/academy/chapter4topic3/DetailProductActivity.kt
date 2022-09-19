package binar.academy.chapter4topic3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import binar.academy.chapter4topic3.databinding.ActivityDetailProductBinding
import kotlinx.android.synthetic.main.activity_detail_product.*

class DetailProductActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_product)

        // It will return to homepage
        binding.topAppBar.setOnClickListener {
            onBackPressed()
        }

        // gotData method
        gotData()

        // It will redirect to the whatsapp application
        btnBuy.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, "Hai, saya tertarik dengan "+gotData()+", apakah masih tersedia ?")
            intent.type = "text/plain"
            intent.setPackage("com.whatsapp")
            startActivity(Intent.createChooser(intent,""))
            startActivity(intent)
        }
    }

    // Passed the product data in a serializable way
    private fun gotData() {
        val gotProduct = intent.getSerializableExtra("product") as DataProduct
        binding.product = DataProduct(gotProduct.nameProduct, gotProduct.imgProduct, gotProduct.priceProduct, gotProduct.stockProduct, gotProduct.descProduct)
    }
}