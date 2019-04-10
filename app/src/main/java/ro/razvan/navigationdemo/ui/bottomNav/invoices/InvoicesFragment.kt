package ro.razvan.navigationdemo.ui.bottomNav.invoices

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ro.razvan.navigationdemo.databinding.FragmentInvoicesBinding

class InvoicesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return FragmentInvoicesBinding.inflate(inflater, container, false).root
    }

}