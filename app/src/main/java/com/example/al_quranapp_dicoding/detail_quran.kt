package com.example.al_quranapp_dicoding

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import androidx.appcompat.app.ActionBar


class detail_quran : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_quran)
        val actionBar = supportActionBar
        actionBar!!.title = "Detail Surah"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tvSetName : TextView = findViewById(R.id.tv_set_name)
        val tvSetPhoto : ImageView = findViewById(R.id.img_item_photo)
        val tvSetIden : TextView = findViewById(R.id.tv_set_identity)
        val tvSetOverview : TextView = findViewById(R.id.tv_set_overview)
        val tvSetJumlah : TextView = findViewById(R.id.tv_item_rank)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getStringExtra(EXTRA_PHOTO)
        val tIden = intent.getStringExtra(EXTRA_IDENTITY)
        val tOverview = intent.getStringExtra(EXTRA_OVERVIEW)
        val tJumlah = intent.getStringExtra(EXTRA_JUMLAH)

        tvSetName.text = tName

        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(tvSetPhoto)

        tvSetIden.text = tIden
        tvSetOverview.text = tOverview
        tvSetJumlah.text = tJumlah
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_IDENTITY = "extra_identity"
        const val EXTRA_OVERVIEW = "extra_overview"
        const val EXTRA_JUMLAH = "extra_jumlah"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}