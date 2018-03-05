package com.bignerdranch.android.recipechecklist;

/**
 * Created by Dymyll on 2/24/2018.
 */


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;



public class IngridientFragment extends Fragment {

    private Recipe mGrocery;
    // Array of strings...

    private CheckBox mIngredient;

    int x = 7;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recipe, container, false);
        final String[] mobileArray = {"Lasagna Noodles", "Ground Beef", "Marinara Sauce", "Ricotta Cheese", "Mozzarella Shredded Cheese"};
        final CheckBox[] checkBoxesArray = {mIngredient};
        ListView ListView = (ListView) view.findViewById(R.id.mobile_list);



            ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>
                    (


                            getActivity(),
                            android.R.layout.simple_list_item_multiple_choice,
                            mobileArray
                    );


            ListView.setAdapter(ListViewAdapter);





        return view;
    }


    }


