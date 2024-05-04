package com.example.lab513_fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import com.example.lab513_fragments.R

class RegistroFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_registro,container,false)
        val spnCountry: Spinner = view.findViewById(R.id.spnCountry)
        val etFullName: EditText = view.findViewById(R.id.etFullName)
        val etEmail: EditText = view.findViewById(R.id.etEmail)
        val rgGender: RadioGroup = view.findViewById(R.id.rgGender)
        val rbMale: RadioButton = view.findViewById(R.id.rbMale)
        val rbFemale: RadioButton = view.findViewById(R.id.rbFemale)
        val rbOther: RadioButton = view.findViewById(R.id.rbOther)
        val chkLicense: CheckBox = view.findViewById(R.id.chkLicense)
        val chkCar: CheckBox = view.findViewById(R.id.chkCar)
        val btnSave: Button = view.findViewById(R.id.btnSave)

        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.CountryArray,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spnCountry.adapter = adapter
        }

        var spnCountryValue=""

        spnCountry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>,view: View?,position: Int,id: Long) {
                spnCountryValue = parent.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //
            }
        }
        btnSave.setOnClickListener{
            val intSelectButton: Int = rgGender!!.checkedRadioButtonId
            val radioButton: RadioButton = view.findViewById(intSelectButton)
            val genderValue = radioButton.text
            val fullNameValue = etFullName.text
            val etEmailValue = etEmail.text

            Toast.makeText(requireContext(),"Fullname: $fullNameValue",Toast.LENGTH_LONG).show()
            Toast.makeText(requireContext(),"etEmailValue: $etEmailValue",Toast.LENGTH_LONG).show()
            Toast.makeText(requireContext(),"genderValue: $genderValue",Toast.LENGTH_LONG).show()
            Toast.makeText(requireContext(),"spnCountryValue: $spnCountryValue",Toast.LENGTH_LONG).show()
            Toast.makeText(requireContext(),"chkLicense: ${chkLicense.isChecked}",Toast.LENGTH_LONG).show()
            Toast.makeText(requireContext(),"chkCar: ${chkCar.isChecked}",Toast.LENGTH_LONG).show()
        }
        return view

        //return inflater.inflate(R.layout.fragment_registro, container, false)
    }
}