package com.dum.dumscore

import android.content.Context
import android.content.ContextWrapper
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import java.util.*


abstract class BaseActivity : AppCompatActivity() {


    /**
     * Take care of locale
     */
    override fun attachBaseContext(newBase: Context) {
        val preferences = PreferenceManager.getDefaultSharedPreferences(newBase)
        val locale = when(preferences.getString(Languages.languageKey, "")) {
            "russian" -> Locale("ru")
            else -> Locale.getDefault()
        }
        val localeUpdatedContext: ContextWrapper = ContextUtils.updateLocale(
            newBase,
            locale
        )
        super.attachBaseContext(localeUpdatedContext)
    }


}