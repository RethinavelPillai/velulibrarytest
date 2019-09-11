package com.lib.velu

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lib.cvtlibrary.Avengers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = Avengers("Rethinavel").getName();
        Toast.makeText(this@MainActivity, name, Toast.LENGTH_SHORT).show()
    }
}
