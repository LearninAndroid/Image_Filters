package dev.brian.com.filters.utils
import android.content.Context
import android.view.animation.DecelerateInterpolator
import android.widget.Scroller

class MyScroller(context: Context) :Scroller(context,DecelerateInterpolator()) {

    override fun startScroll(startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) {
        super.startScroll(startX, startY, dx, dy, 400)
    }
}
