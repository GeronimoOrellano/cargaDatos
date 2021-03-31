package com.example.cargadatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cargadatos.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var state = 0

        binding.send.setOnClickListener {
            var nameSaved = binding.name.text.toString()
            var surnameSaved = binding.surname.text.toString()
            var cellphoneSaved = binding.cellphone.text.toString()



            if (nameSaved.isEmpty() || surnameSaved.isEmpty() || cellphoneSaved.isEmpty()) {

                Toast.makeText(this,"Rellenar todos los campos",Toast.LENGTH_LONG).show()
            }
            else {
                if (state==0) {
                    binding.white.text = "Nombre:${nameSaved}  Apellido:${surnameSaved} Celular:${cellphoneSaved}"
                    state=1
                }
                else {
                    binding.white2.text = "Nombre:${nameSaved}  Apellido:${surnameSaved} Celular:${cellphoneSaved}"
                    state=0
                }
            }
        }
        binding.delete.setOnClickListener {
            binding.name.text.clear()
            binding.surname.text.clear()
            binding.cellphone.text.clear()
            state=0
            binding.white.text=""
            binding.white2.text=""
        }
    }
}

