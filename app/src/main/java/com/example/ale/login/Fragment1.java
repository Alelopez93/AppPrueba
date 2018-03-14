package com.example.ale.login;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    ImageView imgimagen;
    Button boton;
    static final int REQUEST_IMAGE_CAPTURE = 1;


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragment1, container, false);
        View rootView = inflater.inflate(R.layout.fragment_fragment1,container, false);

        boton = (Button) rootView.findViewById(R.id.boton);
        imgimagen = (ImageView) rootView.findViewById(R.id.imgimagen);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llamarIntent();
            }
        });

        return rootView;
    }

    private void llamarIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imgimagen.setImageBitmap(imageBitmap);
        }
    }



}
