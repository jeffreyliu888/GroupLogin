package com.liubase.groups.grouplogin

import android.support.v4.app.*
import com.liubase.groups.groupmain.*

/* Created by Jeffrey Liu on 2/04/2018. */
class LoginModule : BaseModule() {
    
    override fun entryFragment() : Fragment {
        val f = LoginFragment()
        f.module = this
        return f
    }
}