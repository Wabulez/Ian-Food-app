package com.ian.foodapp

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class LoginSignupAdapter(private val context: Context, fm: FragmentManager, internal var totalTabs: Int) :
    FragmentPagerAdapter(fm) {

    override fun getItem (position:Int): Fragment {
        when(position){
            0->{
                //val logintabfragment:LoginTabFragment = LoginTabFragment()
                return LoginTabFragment()
            }
            1->{
                return SignupTabFragment()
            }
            else->{
                return SignupTabFragment()
            }
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}