package roiattia.com.mymoney.ui.income

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import roiattia.com.mymoney.R

class IncomeFragment : Fragment() {

    companion object {
        fun newInstance() = IncomeFragment()
    }

    private lateinit var viewModel: IncomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_income, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(IncomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
