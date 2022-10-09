package com.pk4us.cryptoapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.pk4us.cryptoapp.databinding.ActivityCoinDetailBinding
import com.squareup.picasso.Picasso


class CoinDetailActivity : AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel
    lateinit var binding: ActivityCoinDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinDetailBinding.inflate(layoutInflater).also { setContentView(it.root) }

        if (!intent.hasExtra(EXTRA_FROM_SYMBOL)) {
            finish()
            return
        }
        val fromSymbol = intent.getStringExtra(EXTRA_FROM_SYMBOL)
        viewModel = ViewModelProvider(this)[CoinViewModel::class.java]
        if (fromSymbol != null) {
            viewModel.getDetailInfo(fromSymbol).observe(this, Observer {
                binding.tvPrice.text = it.price
                binding.tvMinPrice.text = it.lowDay
                binding.tvMaxPrice.text = it.highDay
                binding.tvLastMarket.text = it.lastMarket
                binding.tvLastUpdate.text = it.getFormattedTime()
                binding.tvFromSymbol.text = it.fromSymbol
                binding.tvToSymbol.text = it.toSymbol
                Picasso.get().load(it.getFullImageUrl()).into( binding.ivLogoCoin)
            })
        }
    }

    companion object {
        private const val EXTRA_FROM_SYMBOL = "fSym"

        fun newIntent(context: Context, fromSymbol: String): Intent {
            val intent = Intent(context, CoinDetailActivity::class.java)
            intent.putExtra(EXTRA_FROM_SYMBOL, fromSymbol)
            return intent
        }
    }
}
