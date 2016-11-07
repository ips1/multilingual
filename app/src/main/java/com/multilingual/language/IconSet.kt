package com.multilingual.language

/**
 * Created by petrkubat on 07/11/2016.
 */
class IconSet(val smallIcon : Int, val bigIcon : Int) : IconProvider {
    override fun getBigIconId(): Int = bigIcon
    override fun getSmallIconId(): Int = smallIcon
}