package br.edu.fatecpg.appsoma

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Aqui vem a lógica do backend

        // Trazendo os componentes
        val edt_num1 = findViewById<EditText>(R.id.edt_num1);
        val edt_num2 = findViewById<EditText>(R.id.edt_num2);
        val btn_somar = findViewById<Button>(R.id.btn_somar);
        val btn_subtrair = findViewById<Button>(R.id.btn_subtrair);
        val btn_dividir = findViewById<Button>(R.id.btn_dividir);
        val btn_multiplicar = findViewById<Button>(R.id.btn_multiplicar);
        val txv_resultado = findViewById<TextView>(R.id.txv_resultado);

        // ao clicar nesse botao
        btn_somar.setOnClickListener(){
            val valor1 = edt_num1.text.toString().toInt();
            val valor2 = edt_num2.text.toString().toInt();
            val resultado = valor1 + valor2;

            txv_resultado.text = "O resultado é: $resultado"
        }

        btn_subtrair.setOnClickListener(){
            val valor1 = edt_num1.text.toString().toInt();
            val valor2 = edt_num2.text.toString().toInt();
            val resultado = valor1 - valor2;

            txv_resultado.text = "O resultado é: $resultado"
        }

        btn_dividir.setOnClickListener(){
            val valor1 = edt_num1.text.toString().toInt();
            val valor2 = edt_num2.text.toString().toInt();
            val resultado = valor1 / valor2;

            txv_resultado.text = "O resultado é: $resultado"
        }

        btn_multiplicar.setOnClickListener(){
            val valor1 = edt_num1.text.toString().toInt();
            val valor2 = edt_num2.text.toString().toInt();
            val resultado = valor1 * valor2;

            txv_resultado.text = "O resultado é: $resultado"
        }

        // em um ambiente simulado isso não precisa
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}