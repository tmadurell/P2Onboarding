package com.example.p2onboarding;

import android.os.Bundle;
import android.view.*;

import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import androidx.navigation.*;

import com.example.p2onboarding.databinding.FragmentOnboarding1Binding;


public class Onboarding1Fragment extends Fragment {

    NavController navController;
    private FragmentOnboarding1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentOnboarding1Binding.inflate(inflater, container, false)).getRoot();    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        binding.botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_onboarding1Fragment_to_onboarding2Fragment);
            }
        });

        binding.botonSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_onboarding1Fragment_to_homeFragment);
            }
        });
    }
}
