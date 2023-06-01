package com.godrejagrovet.tripsheet.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.godrejagrovet.tripsheet.R
import com.godrejagrovet.tripsheet.databinding.ActivityAmountCollectionDashboardBinding

class AmountCollectionDashboardActivity : AppCompatActivity() {

    private var amountCollectionDashboardBinding: ActivityAmountCollectionDashboardBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amountCollectionDashboardBinding = ActivityAmountCollectionDashboardBinding.inflate(layoutInflater)
        setContentView(amountCollectionDashboardBinding!!.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_dashboard, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.datePicker) {

        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        amountCollectionDashboardBinding = null
    }
}