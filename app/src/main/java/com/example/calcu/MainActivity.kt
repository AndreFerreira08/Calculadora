package com.example.calcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    val zero = findViewById<Button>(R.id.numero_zero)
    val um = findViewById<Button>(R.id.numero_um)
    val dois = findViewById<Button>(R.id.numero_dois)
    val tres = findViewById<Button>(R.id.numero_tres)
    val quatro = findViewById<Button>(R.id.numero_quatro)
    val cinco = findViewById<Button>(R.id.numero_cinco)
    val seis = findViewById<Button>(R.id.numero_seis)
    val sete = findViewById<Button>(R.id.numero_sete)
    val oito = findViewById<Button>(R.id.numero_oito)
    val nove = findViewById<Button>(R.id.numero_nove)
    val ponto = findViewById<Button>(R.id.ponto)
    val limpar = findViewById<Button>(R.id.limpar)
    val add = findViewById<Button>(R.id.adicao)
    val back = findViewById<Button>(R.id.backspace)
    val sub = findViewById<Button>(R.id.subtracao)
    val divisao = findViewById<Button>(R.id.divisao)
    val mult = findViewById<Button>(R.id.multiplicacao)
    val Resul = findViewById<Button>(R.id.resultado)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        zero.setOnClickListener { Qualquer("0", true) }
        um.setOnClickListener { Qualquer("1", true) }
        dois.setOnClickListener { Qualquer("2", true) }
        tres.setOnClickListener { Qualquer("3", true) }
        quatro.setOnClickListener { Qualquer("4", true) }
        cinco.setOnClickListener { Qualquer("5", true) }
        seis.setOnClickListener { Qualquer("6", true) }
        sete.setOnClickListener { Qualquer("7", true) }
        oito.setOnClickListener { Qualquer("8", true) }
        nove.setOnClickListener { Qualquer("9", true) }
        ponto.setOnClickListener { Qualquer(".", true) }

        //Operadores
        add.setOnClickListener { Qualquer("+", false)}
        sub.setOnClickListener { Qualquer("-", false)}
        divisao.setOnClickListener { Qualquer("*", false)}
        mult.setOnClickListener { Qualquer("/",false)}

        limpar.setOnClickListener {

            Resul.text=""
        }

        backspace.setOnClickListener {

            val string = expressao.text.ToString()

            if (string.isNotBlank()){
                val string = expressao.text.ToString()

                if (string.isnotBlank()){
                    expressao.text = string.substring(0, string.lenght-1)
                }
                Resul.text= ""
            }
        }
    }

    fun Qualquer(string: String, limpar_dados : Boolean) {

        if (Resul.text.isNotEmpty()) {
            expressao.text = ""
        }
        if (limpar_dados) {
            expressao.text = ""
            expressao.append(string)

        } else {
            expressao.append(Resul.text)
            expressao.append(string)
            Resul.text = ""
        }
    }
}