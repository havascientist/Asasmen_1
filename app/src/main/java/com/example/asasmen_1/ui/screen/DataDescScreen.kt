package com.example.asasmen_1.ui.screen


import androidx.lifecycle.ViewModel
import com.example.asasmen_1.model.DaftarDesc

class MainViewModel : ViewModel() {

    val data = getDataDummy()

    private fun getDataDummy(): List<DaftarDesc> {
        val data = mutableListOf<DaftarDesc>()

        data.add(DaftarDesc(1, "Shampoo", "2024-04-01", "Buy 2 Get 1 Free"))
        data.add(DaftarDesc(2, "Soap", "2024-04-01", "20% Off"))
        data.add(DaftarDesc(3, "Toothpaste", "2024-04-01", "Buy 1 Get 1 50% Off"))
        data.add(DaftarDesc(4, "Rice", "2024-04-01", "10% Off"))
        data.add(DaftarDesc(5, "Milk", "2024-04-01", "Buy 2 Get 1 Free"))
        data.add(DaftarDesc(6, "Bread", "2024-04-01", "15% Off"))
        data.add(DaftarDesc(7, "Eggs", "2024-04-01", "20% Off"))
        data.add(DaftarDesc(8, "Cooking Oil", "2024-04-01", "10% Off"))
        data.add(DaftarDesc(9, "Snacks", "2024-04-01", "Buy 1 Get 1 50% Off"))
        data.add(DaftarDesc(10, "Soda", "2024-04-01", "Buy 2 Get 1 Free"))
        data.add(DaftarDesc(21, "Tissue", "2024-04-12", "Buy 2 Get 1 Free"))
        data.add(DaftarDesc(22, "Pencil", "2024-04-13", "20% Off"))
        data.add(DaftarDesc(23, "Notebook", "2024-04-14", "Buy 1 Get 1 50% Off"))
        data.add(DaftarDesc(24, "Marker", "2024-04-15", "15% Off"))
        data.add(DaftarDesc(25, "Eraser", "2024-04-16", "Buy 2 Get 1 Free"))
        data.add(DaftarDesc(26, "Ruler", "2024-04-17", "10% Off"))
        data.add(DaftarDesc(27, "Backpack", "2024-04-18", "Buy 1 Get 1 50% Off"))
        data.add(DaftarDesc(28, "Lunchbox", "2024-04-19", "20% Off"))
        data.add(DaftarDesc(29, "Water Bottle", "2024-04-20", "Buy 2 Get 1 Free"))
        data.add(DaftarDesc(30, "Glue", "2024-04-21", "15% Off"))
        data.add(DaftarDesc(31, "Shampoo", "2024-04-22", "Buy 2 Get 1 Free"))
        data.add(DaftarDesc(32, "Soap", "2024-04-23", "20% Off"))
        data.add(DaftarDesc(33, "Toothpaste", "2024-04-24", "Buy 1 Get 1 50% Off"))
        data.add(DaftarDesc(34, "Toothbrush", "2024-04-25", "15% Off"))
        data.add(DaftarDesc(35, "Conditioner", "2024-04-26", "Buy 2 Get 1 Free"))
        data.add(DaftarDesc(36, "Body Lotion", "2024-04-27", "10% Off"))
        data.add(DaftarDesc(37, "Deodorant", "2024-04-28", "Buy 1 Get 1 50% Off"))
        data.add(DaftarDesc(38, "Face Wash", "2024-04-29", "20% Off"))
        data.add(DaftarDesc(39, "Face Cream", "2024-04-30", "Buy 2 Get 1 Free"))
        data.add(DaftarDesc(40, "Shaving Cream", "2024-05-01", "15% Off"))





        return data
    }
}