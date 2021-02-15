package masson.jorge.asignacion4_calculadoraimc_masson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var estatura: Double = etEstatura.text.toString().toDouble()
    var peso: Double = etPeso.text.toString().toDouble()
    var resultado: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {
            resultado = calcularIMC(estatura, peso).toString()
            tvResultado.setText(resultado)
        }
    }

    private fun calcularIMC(estatura: Double, peso: Double): Double {
        var imc = 0.0

        imc = peso / (estatura * estatura)

        return imc
    }
}
