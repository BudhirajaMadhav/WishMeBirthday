package com.androidmadhav.wishmebirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()
        val fourthFragment = FourthFragment()
        val fifthFragment = FifthFragment()

        addNewFragmentOrPopAllTransactionsTillThatFragment(firstFragment, R.id.flFragment)

        fragment1btn.setOnClickListener{
            addNewFragmentOrPopAllTransactionsTillThatFragment(firstFragment, R.id.flFragment)
        }


        fragment2btn.setOnClickListener{
            addNewFragmentOrPopAllTransactionsTillThatFragment(secondFragment, R.id.flFragment)
        }
        fragment3btn.setOnClickListener{
            addNewFragmentOrPopAllTransactionsTillThatFragment(thirdFragment, R.id.flFragment)
        }
        fragment4btn.setOnClickListener{
            addNewFragmentOrPopAllTransactionsTillThatFragment(fourthFragment, R.id.flFragment)
        }
        fragment5btn.setOnClickListener{
            addNewFragmentOrPopAllTransactionsTillThatFragment(fifthFragment, R.id.flFragment)
        }

    }

    private fun addNewFragmentOrPopAllTransactionsTillThatFragment(fragment: Fragment, frameId: Int) {

        val backStateName = fragment.javaClass.name
        val fragmentPopped = supportFragmentManager.popBackStackImmediate(backStateName, 0)
        if( !fragmentPopped ) {
            supportFragmentManager.beginTransaction().apply {
                replace(frameId, fragment)
                addToBackStack(backStateName)
                commit()
            }

        }

    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 1){
            finish()
        }
        else {
            super.onBackPressed()
        }
    }
}