package ru.sikod.recipe.ui.auth

import android.accounts.AccountManager
import android.accounts.AccountManagerCallback
import android.accounts.AccountManagerFuture
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityCompat.startActivityForResult

class AuthGoogle {


    private inner class OnTokenAcquired : AccountManagerCallback<Bundle> {

        override fun run(result: AccountManagerFuture<Bundle>) {
            val launch: Intent? = result.getResult().get(AccountManager.KEY_INTENT) as? Intent
            if (launch != null) {
                //startActivityForResult(launch, 0)
            }
        }
    }
}