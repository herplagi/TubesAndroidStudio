package com.example.curcolgan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.widget.Button; // Tambahkan baris ini untuk mengimpor kelas Button


public class FragProfile extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_profile, container, false);

        // Menginisialisasi tombol "Edit Profil"
        Button editProfileButton = view.findViewById(R.id.edit_profile_button);
        editProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke FragEdit saat tombol "Edit Profil" ditekan
                Intent intent = new Intent(getActivity(), FragEdit.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
