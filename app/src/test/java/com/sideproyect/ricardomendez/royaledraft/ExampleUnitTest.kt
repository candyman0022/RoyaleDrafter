package com.sideproyect.ricardomendez.royaledraft

import android.util.JsonReader
import com.google.gson.GsonBuilder
import com.sideproyect.ricardomendez.royaledraft.model.Player
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import org.junit.Test


import org.junit.Assert.*
import java.io.StringReader

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    val PLAYER_URL = "https://api.clashroyale.com/v1/players/%232V8QGRRL"
    @Test
    fun clash_api_isCorrect() {
        val client = OkHttpClient()

        val bearer = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjJjM2NlYmIxLWRhM2UtNDJmZi1hY2ZhLTliNjEwYzVjZmUxMiIsImlhdCI6MTUzNDg4Mzk5OCwic3ViIjoiZGV2ZWxvcGVyLzViYTQ2Yzk1LTEwMjQtM2M0YS0xMTI3LWJjZjYyYzZlNjA4YyIsInNjb3BlcyI6WyJyb3lhbGUiXSwibGltaXRzIjpbeyJ0aWVyIjoiZGV2ZWxvcGVyL3NpbHZlciIsInR5cGUiOiJ0aHJvdHRsaW5nIn0seyJjaWRycyI6WyIxODcuMTYzLjE3OS4yMTgiXSwidHlwZSI6ImNsaWVudCJ9XX0.vYGb5NDuGih9LYHoa_bBmChK65NdsM3lwN63ql158OZtHGiM8Wr7lSt-7Z_ogUj-d6vT67_RMkTva-YpxKwTaw"
        val request = Request.Builder()
                .url(PLAYER_URL)
                .get()
                .addHeader("Authorization", bearer)
                .addHeader("Content-Type", "application/json")
                .build()


        val response = client.newCall(request).execute()

        val objectPlayer = getPlayerObjectFromJson(response.body()!!.string())

        val responseKhttp = khttp.get(
                url = PLAYER_URL,
                headers = mapOf("Authorization" to bearer, "Content-Type" to "application/json")
        )

        val printOut = "Some string to pring out"

        val ricardo = Player(responseKhttp.jsonObject.get("tag") as String,"",0,0,0,0,0,0,0,0,0,0,0,"",0,0,0,0,0)

        println(ricardo)
    }

    fun getPlayerObjectFromJson(jsonString:String): Player {
        var stringReader: StringReader = StringReader(jsonString)
        var jsonReader: JsonReader = JsonReader(stringReader)

        val gsonBuilder = GsonBuilder().serializeNulls()
        val gson = gsonBuilder.create()

        val weatherList: Player = gson.fromJson(stringReader ,Player::class.java)

        return weatherList
    }
 }
