package com.unasp.mensagem_secreta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BoasVindasFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BoasVindasFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_boas_vindas, container, false)
        val startButton = view.findViewById<Button>(R.id.btn_start)

        startButton.setOnClickListener {
            val navController = view.findNavController().navigate(R.id.action_boasVindasFragment_to_messagemFragment)
        }

        return view
    }
}