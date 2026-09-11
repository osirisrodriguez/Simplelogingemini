package com.example.simplelogingemini

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.simplelogingemini.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Setup ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Login Button Click Listener
        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Showing the requested Toast
                Toast.makeText(this, "ingresaste las credenciales correctas", Toast.LENGTH_SHORT).show()
            } else {
                // Simple validation feedback
                if (username.isEmpty()) {
                    binding.etUsername.error = "Ingrese el usuario"
                }
                if (password.isEmpty()) {
                    binding.etPassword.error = "Ingrese la contraseña"
                }
            }
        }
    }
}