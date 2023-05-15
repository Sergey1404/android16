package com.example.navigationapplication.presentation

import androidx.navigation.fragment.findNavController
import com.example.navigationapplication.R

class ThirdFragment : BaseFragment(R.layout.third_fragment) {
    override val buttonId: Int
        get() = R.id.btNext

    override fun onClick() {
        findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
    }
}