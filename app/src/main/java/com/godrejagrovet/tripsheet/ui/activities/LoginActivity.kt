package com.godrejagrovet.tripsheet.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.godrejagrovet.tripsheet.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private var activityLoginBinding: ActivityLoginBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(activityLoginBinding!!.root)

    }

    override fun onDestroy() {
        super.onDestroy()

    }
}