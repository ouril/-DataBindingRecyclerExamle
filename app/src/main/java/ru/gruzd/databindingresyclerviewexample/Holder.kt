package ru.gruzd.databindingresyclerviewexample

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import ru.gruzd.databindingresyclerviewexample.databinding.ItemBinding

class Holder(val view: View): RecyclerView.ViewHolder(view) {
   val binding: ItemBinding  = DataBindingUtil.bind(view)!!

}