package ro.razvan.navigationdemo.ui.bottomNav.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ro.razvan.navigationdemo.databinding.FragmentDetailsBinding

class DetailsFragment: Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return FragmentDetailsBinding.inflate(inflater, container, false).root
    }

}