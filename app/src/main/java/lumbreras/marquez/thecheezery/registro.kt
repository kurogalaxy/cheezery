package lumbreras.marquez.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        btn_registro.setOnClickListener{
            val intent = Intent(this, menuActivity::class.java)
            startActivity(intent)
        }
    }
}
