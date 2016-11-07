package com.multilingual.language

/**
 * Created by petrkubat on 07/11/2016.
 */
class Language(val code : String, val name : String, val iconProvider : IconProvider) : IconProvider by iconProvider