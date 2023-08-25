package com.docmeapp.app.modules.resetpasswordverifycode.ui

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.google.android.gms.common.api.CommonStatusCodes
import com.google.android.gms.common.api.Status

class OtpViewOtpviewBroadcastReceiver : BroadcastReceiver() {
  var otpBroadcastReceiverListener: OtpBroadcastListener? = null

  override fun onReceive(context: Context?, intent: Intent?) {
    if (intent?.action == SmsRetriever.SMS_RETRIEVED_ACTION) {
      val extras = intent.extras
      val smsStatus: Status = extras?.get(SmsRetriever.EXTRA_STATUS) as Status
      when (smsStatus.statusCode) {
        CommonStatusCodes.SUCCESS -> {
          val messageIntent: Intent? =
          extras.getParcelable<Intent>(SmsRetriever.EXTRA_CONSENT_INTENT)
          if (messageIntent != null) {
            otpBroadcastReceiverListener?.onSuccess(messageIntent)
          }
        }
        CommonStatusCodes.TIMEOUT -> otpBroadcastReceiverListener?.onFailure()
      }
    }
  }

  interface OtpBroadcastListener {
    fun onSuccess(intent: Intent?) {
    }

    fun onFailure() {
    }
  }
}
