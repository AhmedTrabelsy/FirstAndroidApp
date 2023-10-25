package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var chkAndro: CheckBox
    private lateinit var chkMicro: CheckBox
    private lateinit var btnAffich: Button
    private lateinit var radSpecialityType: RadioGroup
    private lateinit var radDSI: RadioButton
    private lateinit var radRSI: RadioButton
    private lateinit var radSEM: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        chkAndro = findViewById(R.id.chkAndroid)
        chkMicro = findViewById(R.id.chkMicrosoft)
        btnAffich = findViewById(R.id.btnAffich)
        radSpecialityType = findViewById(R.id.radioGroupSpecialiteType)
        radDSI = findViewById(R.id.radDsi)
        radRSI = findViewById(R.id.radRsi)
        radSEM = findViewById(R.id.radSem)

        btnAffich.setOnClickListener {
            var option = ""
            if(radSpecialityType.checkedRadioButtonId != 0){
                option += "Spécialité "
            }
            when (radSpecialityType.checkedRadioButtonId) {
                R.id.radSem -> {
                    option += "SEM"
                }
                R.id.radDsi -> {
                    option += "DSI"
                }
                R.id.radRsi -> {
                    option += "RSI"
                }
            }
            if(chkAndro.isChecked or chkMicro.isChecked){
                option += " Club "
            }
            if (chkAndro.isChecked) {
                option += "Android "
            }
            if(chkAndro.isChecked and chkMicro.isChecked){
                option += "et "
            }
            if (chkMicro.isChecked) {
                option += "Microsoft"
            }
                Toast.makeText(applicationContext, option, Toast.LENGTH_LONG).show()
        }
    }
}