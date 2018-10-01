package com.ricknout.worldrugbyranker.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ricknout.worldrugbyranker.R
import kotlinx.android.synthetic.main.fragment_info.*

class InfoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
            = inflater.inflate(R.layout.fragment_info, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        howAreWorldRugbyRankingsCalculatedButton.setOnClickListener {
            // TODO
        }
        shareThisAppButton.setOnClickListener {
            // TODO
        }
        viewSourceCodeButton.setOnClickListener {
            // TODO
        }
        openSourceLicensesButton.setOnClickListener {
            // TODO
        }
    }

    companion object {
        const val TAG = "InfoFragment"
    }
}
