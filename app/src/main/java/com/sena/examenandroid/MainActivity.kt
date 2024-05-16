package com.sena.examenandroid

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sena.examenandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kilometrosBtn.setOnClickListener(this)
        binding.centimetrosBtn.setOnClickListener(this)
        binding.milimetrosBtn.setOnClickListener(this)
    }

    fun metrosKilometros(metros: String): String {
        val conversion = (metros.toFloat() / 1000)
        val retorno ="Son: $conversion kilometros"
        return retorno
    }

    fun metrosCentimetros(metros: String): String {
        val conversion = (metros.toFloat() * 100)
        return "Son: $conversion centimetros"
    }

    fun metrosMilimetros(metros: String): String {
        val conversion = (metros.toFloat() * 1000)
        return "Son: $conversion milimetros"
    }

    override fun onClick(v: View?) {
        when(v){
            binding.kilometrosBtn -> {
                if (binding.metrosInput.text.toString().isNotEmpty()){
                    Toast.makeText(this, metrosKilometros(binding.metrosInput.text.toString()), Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Debes ingresar un número válido", Toast.LENGTH_SHORT).show()
                }
            }
            binding.centimetrosBtn -> {
                if (binding.metrosInput.text.toString().isNotEmpty()){
                    Toast.makeText(this, metrosCentimetros(binding.metrosInput.text.toString()), Toast.LENGTH_LONG).show()
                }
                else {
                    Toast.makeText(this, "Debes ingresar un número válido", Toast.LENGTH_SHORT).show()
                }
            }
            binding.milimetrosBtn -> {
                if (binding.metrosInput.text.toString().isNotEmpty()){
                    Toast.makeText(this, metrosMilimetros(binding.metrosInput.text.toString()), Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Debes ingresar un número válido", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}