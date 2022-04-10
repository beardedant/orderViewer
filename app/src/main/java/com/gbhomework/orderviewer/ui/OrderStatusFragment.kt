package com.gbhomework.orderviewer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gbhomework.orderviewer.databinding.FragmentOrderStatusBinding

class OrderStatusFragment : Fragment() {
    companion object {
        fun newInstance() = OrderStatusFragment()
    }

    private var _binding: FragmentOrderStatusBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOrderStatusBinding.inflate(inflater)
        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}