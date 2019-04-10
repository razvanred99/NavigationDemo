package ro.razvan.navigationdemo.ui.bottomNav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.fragment_bottom_nav.*
import ro.razvan.navigationdemo.R
import ro.razvan.navigationdemo.databinding.FragmentBottomNavBinding

class BottomNavFragment : Fragment() {

    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return FragmentBottomNavBinding.inflate(inflater, container, false).apply {

            bottomNavigation = this.bottomNavigationView

        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(requireActivity(), R.id.bottomNavFragment)
        bottomNavigation.setupWithNavController(navController)
    }

}