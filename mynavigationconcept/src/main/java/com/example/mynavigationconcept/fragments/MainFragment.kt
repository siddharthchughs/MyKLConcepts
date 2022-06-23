package com.example.mynavigationconcept.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.mynavigationconcept.R
import com.example.mynavigationconcept.databinding.FragmentMainBinding
import com.example.mynavigationconcept.viewmodel.MainViewModel
import com.example.mynavigationconcept.viewmodel.MainViewModelFactory
import com.example.mynavigationconcept.viewmodel.MyCustomMainViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var _binding : FragmentMainBinding? = null
    private val binding get() = _binding!!
    private var count: Int = 0
    private lateinit var mainViewModel: MainViewModel
    private lateinit var myCustomMainViewModel: MyCustomMainViewModel
    private lateinit var mainViewModelFactory: MainViewModelFactory
    private val usernameDeeplink : MainFragmentArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (requireActivity() as AppCompatActivity).run {
            supportActionBar?.setDisplayHomeAsUpEnabled(false)
        }
        _binding  = FragmentMainBinding.inflate(inflater,container,false)
        mainViewModelFactory = MainViewModelFactory(0)
        myCustomMainViewModel = ViewModelProvider(requireActivity(), mainViewModelFactory).get(MyCustomMainViewModel::class.java)
        binding.viewModel = myCustomMainViewModel
        binding.lifecycleOwner = this
//        myCustomMainViewModel.resultTotal.observe(requireActivity(), Observer {
//        binding.tvResult.text = it.toString()
//    })
//        binding.btnMain.setOnClickListener(object:View.OnClickListener {
  //          override fun onClick(p0: View?) {
//                myCustomMainViewModel.getCountUpdate()
//                //myCustomMainViewModel.getUpdate(binding.edtInputData.text.toString().toInt()).toString()
////                binding.tvResult.text = myCustomMainViewModel.total.toString()
    //        }
      //  })
        val userName = usernameDeeplink.username.toString()
        binding.edtInputData.setText(userName)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnMain.setOnClickListener(object:View.OnClickListener {
            override fun onClick(p0: View?) {
                val data = binding.edtInputData.text.toString()
//              binding.tvResult.setText(data)
                Navigation.findNavController(view).navigate(MainFragmentDirections.actionMainFragmentToDashboardFragment().setUsername(data))
            }
        })


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}