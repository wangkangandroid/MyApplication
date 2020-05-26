package cc.huanmei.httpwww.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cc.huanmei.httpwww.appbase.AppMainActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ches
        startActivity(Intent(this, AppMainActivity::class.java))
    }
}
