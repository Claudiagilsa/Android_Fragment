package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityFragmentBinding


class Form:AppCompatActivity() {

    lateinit var binding: ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1Btn.setOnClickListener{
            replaceFragment(Fragment1())
        }


        binding.fragment2Btn.setOnClickListener{
            replaceFragment(Fragment2())

        }

        binding.fragment3Btn.setOnClickListener{
            replaceFragment(Fragment3())

        }

        binding.fragment4Btn.setOnClickListener{
            replaceFragment(Fragment4())

        }

        binding.fragment5Btn.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer,fragment)
        fragmentTransaction.commit()
    }


}
