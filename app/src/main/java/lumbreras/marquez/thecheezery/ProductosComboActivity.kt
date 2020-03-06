package lumbreras.marquez.thecheezery

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_productocombo.*
import kotlinx.android.synthetic.main.activity_productos.img_productos
import kotlinx.android.synthetic.main.producto_view.view.*

class ProductosComboActivity : AppCompatActivity() {

    var productos_seccion = ArrayList<Productos>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productocombo)

        cargarProductosCombo()
        img_productos.setImageResource(R.drawable.combos)

        var adaptador= AdaptadorProductos(this, productos_seccion)
        gridView.adapter=adaptador
    }

    fun cargarProductosCombo(){
        productos_seccion.add(Productos("Smoothie & Panini", R.drawable.smoothiepanini, "Avocado and fruit Smoothie with a medium size panini.", 10))
        productos_seccion.add(Productos("Cupcake and American Expresso", R.drawable.cupcakeandamericancoffe, "Delicious Expresso with a surprise cupcake.", 7))
        productos_seccion.add(Productos("Sandwich & Fries", R.drawable.sandwichandfries, "A healthy hand-made sandwich with the saltie french fries. A weird combo but you won't regret it.", 10))
    }


    private class AdaptadorProductos: BaseAdapter {

        var productos= ArrayList<Productos>()
        var contexto: Context? = null

        constructor(contexto: Context, productos: ArrayList<Productos>){
            this. contexto=contexto
            this.productos=productos
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod= productos[position]
            var inflador= LayoutInflater.from(contexto)
            var vista= inflador.inflate(R.layout.producto_view, null)

            vista.producto_img.setImageResource(prod.imagen)
            vista.producto_nombre.setText(prod.nombre)
            vista.producto_desc.setText(prod.descripcion)
            vista.producto_precio.setText("$${prod.precio}")

            return vista
        }

        override fun getItem(position: Int): Any {
            return productos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return productos.size
        }

    }
}
