package com.pk4us.object_oriented_programming.accessModifiers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pk4us.object_oriented_programming.R

class AccessModifiers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_access_modifiers)

    }

    public val  a = 1
    private val  b = 1
    protected val  c = 1
    internal val  d = 1

}