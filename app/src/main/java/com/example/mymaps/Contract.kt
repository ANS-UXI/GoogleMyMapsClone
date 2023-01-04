package com.example.mymaps

import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import com.example.mymaps.model.UserMap

class Contract: ActivityResultContract<String, UserMap>() {
    override fun createIntent(context: Context, input: String): Intent {
        val intent = Intent(context, CreateMapActivity::class.java)
        intent.putExtra("EXTRA_MAP_TITLE", input)
        return intent
    }

    override fun parseResult(resultCode: Int, intent: Intent?): UserMap {

    }

}