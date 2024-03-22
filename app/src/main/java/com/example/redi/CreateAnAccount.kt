package com.example.redi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CreateAnAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_an_account)

        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val fullText = checkBox.text.toString()

        val spannableString = SpannableString(fullText)
        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ"))
                startActivity(intent)
            }
        }

        val startIndex = fullText.indexOf("Terms and сonditions and private policy")
        val endIndex = startIndex + "Terms and сonditions and private policy".length

        spannableString.setSpan(clickableSpan, startIndex, endIndex, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#EBBC2E")), startIndex, endIndex, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE)

        checkBox.text = spannableString
        checkBox.movementMethod = LinkMovementMethod.getInstance()

         val signIn: TextView = findViewById(R.id.SignIn)

        signIn.setOnClickListener{
            val intent2 = Intent(this, WelcomeBack::class.java)
            startActivity(intent2)
        }
    }
}