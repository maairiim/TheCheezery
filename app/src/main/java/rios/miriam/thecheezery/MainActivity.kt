package rios.miriam.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGetStarted: Button = findViewById(R.id.btnGetStarted) as Button;

        btnGetStarted.setOnClickListener(){
            var intent: Intent = Intent(this,RegisterActivity::class.java);
            startActivity(intent);


        }

    }
}
