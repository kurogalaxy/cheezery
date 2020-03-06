package lumbreras.marquez.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class menuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        btn_colddrinks.setOnClickListener{

            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("cual", "colddrinks")
            startActivity(intent)
        }

        btn_hotdrinks.setOnClickListener{
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("cual", "hotdrinks")
            startActivity(intent)
        }

        btn_sweets.setOnClickListener{
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("cual", "sweets")
            startActivity(intent)
        }

        btn_salties.setOnClickListener{
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("cual", "salties")
            startActivity(intent)
        }
        btn_combos.setOnClickListener{
            val intent = Intent(this, ProductosComboActivity::class.java)
            startActivity(intent)
        }
        btn_person.setOnClickListener{

        }
    }
}
