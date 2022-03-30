package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycleview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"Paulo Londra - Plan A\", \"channel\":\"Paulo Londra\",\"views\":\"50 M de vistas\",\"datePosted\":\"hace 6 días\",\"duration\":\"3:06\"}"),
            JSONObject("{\"title\": \"Daddy Yankee x Bad Bunny - X Última vez\", \"channel\":\"Daddy Yankee\",\"views\":\"10 M de vistas\",\"datePosted\":\"hace 5 días\",\"duration\":\"3:12\"}"),
            JSONObject("{\"title\": \"Kenia Os - Se Fue la Luz\", \"channel\":\"K OS\",\"views\":\"2.8 M de vistas\",\"datePosted\":\"hace 6 días\",\"duration\":\"3:06\"}"),
            JSONObject("{\"title\": \"Kenia Os - La Carta\", \"channel\":\"K OS\",\"views\":\"1.4 M de vistas\",\"datePosted\":\"hace 6 días\",\"duration\":\"3:12\"}"),
            JSONObject("{\"title\": \"Daddy Yankee - Rumbatón\", \"channel\":\"Daddy Yankee\",\"views\":\"28 M de vistas\",\"datePosted\":\"hace 5 días\",\"duration\":\"4:15\"}")
            )
        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}