package binar.academy.chapter4topic3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import binar.academy.chapter4topic3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var vmProduct: ViewModelProduct
    private lateinit var adapterProduct: ProductAdapter
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Init ViewModel & Adapter
        vmProduct = ViewModelProvider(this)[ViewModelProduct :: class.java]
        adapterProduct = ProductAdapter(ArrayList())

        // Re-call ViewModel
        vmProduct.getProduct()
        // Observe the Live Data
        vmProduct.product.observe(this, Observer {
            adapterProduct.setDataProduct(it as ArrayList<DataProduct>)
        })

        /*rvProduct = findViewById(R.id.rvProduct)*/
        // Set LayoutManager untuk RecyclerView - Set Adapter ke RecyclerView
        binding.rvProduct.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProduct.adapter = adapterProduct
    }
}