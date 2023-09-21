package com.docmeapp.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.docmeapp.app.R
import com.docmeapp.app.appcomponents.base.BaseActivity
import com.docmeapp.app.appcomponents.facebookauth.FacebookHelper
import com.docmeapp.app.appcomponents.googleauth.GoogleHelper
import com.docmeapp.app.appcomponents.views.ImagePickerFragmentDialog
import com.docmeapp.app.databinding.ActivityLoginBinding
import com.docmeapp.app.modules.login.`data`.viewmodel.LoginVM
import com.docmeapp.app.modules.loginsuccess.ui.LoginSuccessDialog
import com.docmeapp.app.modules.resetpasswordemailtabcontainer.ui.ResetPasswordEmailTabContainerActivity
import com.docmeapp.app.modules.signup.ui.SignUpActivity
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  private lateinit var googleLogin: GoogleHelper

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.imageCamera.setOnClickListener {
        ImagePickerFragmentDialog().show(supportFragmentManager)
        { path ->//TODO HANDLE DATA
        }

            }
        binding.txtSignUp.setOnClickListener {
          val destIntent = SignUpActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.imageArrowleft.setOnClickListener {
          finish()
        }
        binding.txtForgotPassword.setOnClickListener {
          val destIntent = ResetPasswordEmailTabContainerActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        binding.linearRowfacebook.setOnClickListener {
          LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
          facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
            override fun onSuccess(result: LoginResult?) {
            }
            override fun onError(error: FacebookException?) {
            }
            override fun onCancel() {
            }
            })
          }
          binding.linearRowgoogle.setOnClickListener {
            googleLogin.login()
          }
          binding.btnLoginOne.setOnClickListener {
            val destFragment = LoginSuccessDialog.getInstance(null)
            destFragment.show(this.supportFragmentManager, LoginSuccessDialog.TAG)
          }
        }

        companion object {
          const val TAG: String = "LOGIN_ACTIVITY"


          fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, LoginActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
          }
        }
      }
