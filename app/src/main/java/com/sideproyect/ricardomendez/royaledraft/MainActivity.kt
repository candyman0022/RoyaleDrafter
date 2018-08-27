package com.sideproyect.ricardomendez.royaledraft

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.sideproyect.ricardomendez.royaledraft.common.JSONUtils
import com.sideproyect.ricardomendez.royaledraft.common.URLUtils
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val searchButton: Button = findViewById(R.id.playerSearch)
        searchButton.setOnClickListener(handleButtonClick)

    }


    private val handleButtonClick = View.OnClickListener {  _->
        Log.d("my_tag", "click!")

        val client = OkHttpClient()
        val editText:EditText = findViewById<EditText>(R.id.editText)
        val request = Request.Builder()
                .url(URLUtils.playerULR(editText.getText().toString()))
                .addHeader("Authorization", URLUtils.APIToken())
                .addHeader("Content-Type", "application/json")
                .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) {

                this@MainActivity.runOnUiThread {
                    val ricardo = JSONUtils.getPlayerObjectFromJson(response.body()!!.string())
                    val editViewPlayerName:TextView = findViewById<TextView>(R.id.playerNameResult)
                    val editViewTrophies:TextView = findViewById<TextView>(R.id.trophiesResult)
                    if(ricardo.name != null) {
                        editViewPlayerName.text = ricardo.name
                        editViewTrophies.text = ricardo.trophies.toString()
                    } else {
                        editViewPlayerName.text = getString(R.string.NON_EXISTENT_PLAYER)
                        editViewTrophies.text = ""
                    }


                }
            }
        })
    }

}
