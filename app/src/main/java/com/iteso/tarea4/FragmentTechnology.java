package com.iteso.tarea4;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        itemProduct.setCode(0);
        itemProduct.setDescription("Llevate esta Mac con un 30% de descuento para que" +
                        " puedas programar para XCode y Android sin tener que batallar tanto como en tu" +
                " Windows");
        ItemProduct itemProduct1 = new ItemProduct();
        itemProduct1.setTitle("Alienware");
        itemProduct1.setStore("BestBuy");
        itemProduct1.setLocation("Zapopan Jalisco");
        itemProduct1.setPhone("33 12345678");
        itemProduct1.setImage(1);
        itemProduct.setCode(1);
        itemProduct1.setDescription("Llevate esta Alieware para que puedas jugar pinchis juegos mamalones" +
                        " en tu casita bien agustirri");

        if(this.getArguments() != null) {
            ItemProduct itemProduct2 = new ItemProduct();
                    itemProduct2 = (ItemProduct) this.getArguments().getParcelable("ITEM");
                switch (itemProduct2.getImage()) {
                    case 0:
                        itemProduct.setTitle(itemProduct2.getTitle());
                        itemProduct.setStore(itemProduct2.getStore());
                        itemProduct.setLocation(itemProduct2.getLocation());
                        itemProduct.setPhone(itemProduct2.getPhone());
                        break;
                    case 1:
                        itemProduct1.setTitle(itemProduct2.getTitle());
                        itemProduct1.setStore(itemProduct2.getStore());
                        itemProduct1.setLocation(itemProduct2.getLocation());
                        itemProduct1.setPhone(itemProduct2.getPhone());
                        break;
                }
        }

                products.add(itemProduct);
                products.add(itemProduct1);

        mAdapter = new AdapterProduct(getActivity(),products);
        recyclerView.setAdapter(mAdapter);

        return view;
    }

}
