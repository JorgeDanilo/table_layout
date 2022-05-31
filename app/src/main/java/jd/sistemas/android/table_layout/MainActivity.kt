package jd.sistemas.android.table_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val adapter: ItemsAdapter by lazy {
        ItemsAdapter(init())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_table)

        findViewById<RecyclerView>(R.id.recycler_row).apply {
            adapter = this@MainActivity.adapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun init(): List<Items> {
        return listOf(
            Items("Construir o seu CV online"),
            Items("Receber vagas por e-mail"),
            Items("Enviar o seu CV para quantas vagas quiser"),
            Items("Ter o currículo em destaque"),
            Items("Ultrapassar outros candidatos na vaga"),
            Items("Saber as empresas que viram seu CV"),
            Items("Saber as empresas que viram seu CV"),
            Items("Saber as empresas que viram seu CV do Pedrao e do Vitim"),
        )
    }
}