package com.sangmoki.nav_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // layout 불러오기
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        // 2번 버튼 클릭 이벤트
        view.findViewById<Button>(R.id.btn2).setOnClickListener {
            // 버튼 클릭 시, SecondFragment로 이동
            it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        // 3번 버튼 클릭 이벤트
        view.findViewById<Button>(R.id.btn3).setOnClickListener {
            // 버튼 클릭 시, ThirdFragment로 이동
            it.findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }

        return view
    }
}