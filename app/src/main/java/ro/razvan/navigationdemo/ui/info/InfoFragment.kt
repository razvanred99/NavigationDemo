package ro.razvan.navigationdemo.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ro.razvan.navigationdemo.databinding.FragmentInfoBinding

class InfoFragment: Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return FragmentInfoBinding.inflate(inflater, container, false).root
    }

}