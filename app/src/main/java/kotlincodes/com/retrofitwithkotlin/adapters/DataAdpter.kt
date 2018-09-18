package kotlincodes.com.retrofitwithkotlin.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlincodes.com.retrofitwithkotlin.R
import kotlincodes.com.retrofitwithkotlin.model.DataModel

class DataAdpter(private var dataList: List<DataModel>, private val context: Context) : RecyclerView.Adapter<DataAdpter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_home, parent, false))
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel=dataList.get(position)

        holder.titleTextView.text=dataModel.title
    }


    class ViewHolder(itemLayoutView: View) : RecyclerView.ViewHolder(itemLayoutView) {
        lateinit var titleTextView:TextView
        init {
            titleTextView=itemLayoutView.findViewById(R.id.title)

        }

    }

}