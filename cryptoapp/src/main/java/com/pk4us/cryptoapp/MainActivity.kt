package com.pk4us.cryptoapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pk4us.cryptoapp.api.ApiFactory
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel
    private val compositeDisposable = CompositeDisposable()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        task1()

        viewModel = ViewModelProvider(this)[CoinViewModel::class.java]
        viewModel.loadDate()
        viewModel.priceList.observe(this, Observer {
            Log.d("MyLog","Success in Activity: $it")
        })
    }























    fun task1(): Unit {
        val disposable = ApiFactory.apiService.getFullPriceList(fSyms = "BTC")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("MyLog", it.toString())
            },{
                Log.d("MyLog", it.message.toString())

            })
        compositeDisposable.add(disposable)
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }
}