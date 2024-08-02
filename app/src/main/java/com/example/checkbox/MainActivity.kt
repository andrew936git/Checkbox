package com.example.checkbox

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private  lateinit var checkboxTV: TextView
    private  lateinit var informTV: TextView

    private  lateinit var checkboxCB: CheckBox


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        checkboxTV = findViewById(R.id.checkboxTV)
        informTV = findViewById(R.id.informTV)

        checkboxCB = findViewById(R.id.checkBoxCB)
        checkboxCB.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked) {
                checkboxTV.text = "Правила дорожного движения"
                informTV.text = """1. Перед началом движения, перестроением, поворотом (разворотом) и остановкой водитель обязан подавать сигналы световыми указателями поворота соответствующего направления, а если они отсутствуют или неисправны - рукой. При выполнении маневра не должны создаваться опасность для движения, а также помехи другим участникам дорожного движения.
Сигналу левого поворота (разворота) соответствует вытянутая в сторону левая рука либо правая, вытянутая в сторону и согнутая в локте под прямым углом вверх. Сигналу правого поворота соответствует вытянутая в сторону правая рука либо левая, вытянутая в сторону и согнутая в локте под прямым углом вверх. Сигнал торможения подается поднятой вверх левой или правой рукой."""
            }
            else{
                checkboxTV.text = "Информация"
                informTV.text = ""
            }
        }

    }
}