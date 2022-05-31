package jd.sistemas.android.table_layout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(
    private val data: List<Items>
): RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       return ItemViewHolder(
           LayoutInflater
               .from(parent.context)
               .inflate(R.layout.item_row, parent, false)
       )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindView(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}

class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private var name: TextView?= null
    fun bindView(item: Items) {
        name = view.findViewById(R.id.txt_name)
        name?.text = item.name
    }
}