package com.example.a0510

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.people_listview.view.*

class MyAdapter(private val context: Context, private val items: ArrayList<person>) :
    RecyclerView.Adapter<MyAdapter.ItemViewHolder>() {


    inner class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        private val personName = itemView.findViewById<TextView>(R.id.person_name)
        private val personGrade = itemView.findViewById<TextView>(R.id.person_grade)
        private val personVor = itemView.findViewById<TextView>(R.id.person_vor)
        private val personPhoto = itemView.findViewById<ImageView>(R.id.person_photo)

        fun bind(person: person, context: Context){
            //사진 처
            if(person.photo !=""){
                val resourceId = context.resources.getIdentifier(person.photo, "drawable", context.packageName)
                if(resourceId>0){
                    personPhoto.setImageResource(resourceId)
                }
                else{
                    personPhoto.setImageResource(R.mipmap.normal)
                }
            }
            else{
                personPhoto.setImageResource(R.mipmap.ic_launcher_round)
            }
            //TextView에 데이터 세팅
            personName.text = person.name
            personGrade.text = person.grade
            personVor.text = person.vorstellung
        }
    }

    //보여줄 아이템 개수가 몇개인지 알려줍니다
    override fun getItemCount(): Int = items.size

    //생성된 View에 보여줄 데이터를 설정
    override fun onBindViewHolder(holder: MyAdapter.ItemViewHolder, position: Int) {
        holder.bind(items[position], context)
    }

    //RecyclerView 초기화때 호출된다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflatedView = LayoutInflater.from(parent.context)
            .inflate(R.layout.people_listview, parent, false)    //아이템 뷰 xml설정
        return ItemViewHolder(inflatedView)
    }

    //ViewHolder 단위 객체로 View의 데이터를 설정합니다
    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v

    }
}
