package com.example.appconsultacep

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.example.appconsultacep.api.ViaCepClient
import com.google.android.material.textfield.TextInputLayout
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var edtCep: EditText
    private lateinit var btnConsultar: Button

    private lateinit var txtLogradouro: TextView
    private lateinit var txtBairro: TextView
    private lateinit var txtCidade: TextView
    private lateinit var txtUf: TextView
    private lateinit var txtDdd: TextView

    private fun limparCampos() {
        edtCep.text.clear()
        txtLogradouro.text = ""
        txtBairro.text = ""
        txtCidade.text = ""
        txtUf.text = ""
        txtDdd.text = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        edtCep        = findViewById<EditText>(R.id.edtCep)
        btnConsultar  = findViewById<Button>(R.id.btnConsultar)
        txtLogradouro = findViewById<TextView>(R.id.txtLogradouro)
        txtBairro     = findViewById<TextView>(R.id.txtBairro)
        txtCidade     = findViewById<TextView>(R.id.txtCidade)
        txtDdd        = findViewById<TextView>(R.id.txtDdd)
        txtUf         = findViewById<TextView>(R.id.txtUf)

        val layoutCep = findViewById<TextInputLayout>(R.id.layoutCep)

        layoutCep.setEndIconOnClickListener {
            limparCampos()
        }

        btnConsultar.setOnClickListener {
            val cep = edtCep.text.toString()
            if(cep.length != 8){
                Toast.makeText(
                    this,"CEP inválido",
                    Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            lifecycleScope.launch {

                try {
                    val endereco = ViaCepClient.instance.buscarCep(cep)

                    txtLogradouro.text = endereco.logradouro
                    txtBairro.text = endereco.bairro
                    txtCidade.text = endereco.localidade
                    txtUf.text = endereco.uf
                    txtDdd.text = endereco.ddd

                }catch (erro : Exception){
                    Toast.makeText(
                        this@MainActivity,
                        "Erro na conexão",
                        Toast.LENGTH_LONG).show()

                }
            }
        }
    }
}
