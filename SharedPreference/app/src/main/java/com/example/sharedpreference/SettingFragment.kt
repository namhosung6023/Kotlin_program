package com.example.sharedpreference

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class SettingFragment: PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstancesState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }

}