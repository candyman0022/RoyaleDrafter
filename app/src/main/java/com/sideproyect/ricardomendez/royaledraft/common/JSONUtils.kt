package com.sideproyect.ricardomendez.royaledraft.common

import com.google.gson.GsonBuilder
import com.sideproyect.ricardomendez.royaledraft.model.Player
import java.io.StringReader

object JSONUtils {
    fun getPlayerObjectFromJson(jsonString:String): Player {
        val stringReader = StringReader(jsonString)
        val gsonBuilder = GsonBuilder().serializeNulls()
        val gson = gsonBuilder.create()

        return gson.fromJson(stringReader , Player::class.java)
    }

}