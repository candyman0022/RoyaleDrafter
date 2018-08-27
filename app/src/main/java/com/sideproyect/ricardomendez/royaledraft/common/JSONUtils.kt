package com.sideproyect.ricardomendez.royaledraft.common

import android.util.JsonReader
import com.google.gson.GsonBuilder
import com.sideproyect.ricardomendez.royaledraft.model.Player
import java.io.StringReader

object JSONUtils {
    fun getPlayerObjectFromJson(jsonString:String): Player {
        val stringReader: StringReader = StringReader(jsonString)
        var jsonReader: JsonReader = JsonReader(stringReader)

        val gsonBuilder = GsonBuilder().serializeNulls()
        val gson = gsonBuilder.create()

        val player: Player = gson.fromJson(stringReader , Player::class.java)

        return player
    }

}