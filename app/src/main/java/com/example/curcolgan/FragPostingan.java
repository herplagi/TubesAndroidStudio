package com.example.curcolgan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragPostingan extends Fragment {
    private RecyclerView recyclerView;
    private PostAdapter postAdapter;
    private List<Post> postList;
    private EditText editTextStatus;
    private Button buttonPost;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_postingan, container, false);

        // Inisialisasi komponen tampilan
        editTextStatus = view.findViewById(R.id.editTextStatus);
        buttonPost = view.findViewById(R.id.buttonPost);
        recyclerView = view.findViewById(R.id.recyclerViewPostings);
        postList = new ArrayList<>();
        postAdapter = new PostAdapter(postList);

        // Set layout manager untuk RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(postAdapter);

        // Menangani klik tombol "Post"
        buttonPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String statusText = editTextStatus.getText().toString().trim();
                if (!statusText.isEmpty()) {
                    // Tambahkan postingan baru ke daftar
                    postList.add(new Post("Pengguna Anda", statusText, "Baru saja"));
                    postAdapter.notifyDataSetChanged(); // Memperbarui RecyclerView
                    editTextStatus.setText("");
                }
            }
        });

        return view;
    }
}
