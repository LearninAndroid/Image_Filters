package dev.brian.com.filters.utils

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent
import java.lang.Exception

class NonSwipeableViewPager : ViewPager {
    constructor(context:Context):super(context){
        setMyScroller()
    }
    constructor(context: Context,attributeSet: AttributeSet):super(context,attributeSet){
        setMyScroller()
    }

    override fun onInterceptHoverEvent(event: MotionEvent?): Boolean {
        return false
    }

    private fun setMyScroller(){
        try {
            val viewPager = ViewPager::class.java
            val scroller = viewPager.getDeclaredField("mScroller")
            scroller.isAccessible = true
            scroller.set(this,MyScroller(context))
        }catch (ex: Exception){
            ex.printStackTrace()
        }


    }

}