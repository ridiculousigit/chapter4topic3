package binar.academy.chapter4topic3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import binar.academy.chapter4topic3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vmProduct: ViewModelProduct
    lateinit var adapterProduct: ProductAdapter
    lateinit var rvProduct: RecyclerView
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Init ViewModel & Adapter
        vmProduct = ViewModelProvider(this).get(ViewModelProduct :: class.java)
        adapterProduct = ProductAdapter(ArrayList())

        // Re-call ViewModel
        vmProduct.getProduct()
        vmProduct.product.observe(this, Observer {
            adapterProduct.setDataProduct(it as ArrayList<DataProduct>)
        })

        /*rvProduct = findViewById(R.id.rvProduct)*/
        // Set LayoutManager untuk RecyclerView - Set Adapter ke RecyclerView
        binding.rvProduct.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProduct.adapter = adapterProduct
    }
}