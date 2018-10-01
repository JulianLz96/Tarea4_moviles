package com.iteso.tarea4.tools;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iteso.tarea4.R;
import com.iteso.tarea4.beans.ItemProduct;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTechnology extends android.support.v4.app.Fragment {


    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public FragmentTechnology() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.fragment_technology_recycler_view);

        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        ArrayList<ItemProduct> products = new ArrayList<ItemProduct>();
        ItemProduct itemProduct = new ItemProduct();
        itemProduct.setTitle("MAC\"");
        itemProduct.setStore("BestBuy");
        itemProduct.setLocation("Zapopan Jalisco");
        itemProduct.setPhone("33 12345678");
        itemProduct.setImage(0);
        itemProduct.setDescription("Llevate esta Mac con un 30% de descuento para que" +
                        " puedas programar para XCode y Android sin tener que batallar tanto como en tu" +
                " Windows");
        ItemProduct itemProduct1 = new ItemProduct();
        itemProduct1.setTitle("Alienware");
        itemProduct1.setStore("BestBuy");
        itemProduct1.setLocation("Zapopan Jalisco");
        itemProduct1.setPhone("33 12345678");
        itemProduct1.setImage(1);
        itemProduct1.setDescription("Llevate esta Alieware para que puedas jugar pinchis juegos mamalones" +
                        " en tu casita bien agustirri");
                products.add(itemProduct);
                products.add(itemProduct1);

        mAdapter = new AdapterProduct(getActivity(),products);
        recyclerView.setAdapter(mAdapter);

        return view;
    }

}
