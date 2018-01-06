package denis.musicplayer.ui.main.base

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.View
import denis.musicplayer.R

/**
 * Created by denis on 02/01/2018.
 */
abstract class MainBaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setBackground(position: Int) = with(itemView) {
        when(position % 2) {
            0 -> itemView.background = ContextCompat.getDrawable(itemView.context, R.color.item_even)
            else -> itemView.background = ContextCompat.getDrawable(itemView.context, R.color.item_odd)
        }
    }
}