package br.com.fake.steam

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        changeToLogin()
    }

    fun changeToLogin() {

        val intent = Intent(this, LoginActivity::class.java)

        Handler().postDelayed({
            startActivity(intent)
            finish()
        }, 2000)
    }
}
