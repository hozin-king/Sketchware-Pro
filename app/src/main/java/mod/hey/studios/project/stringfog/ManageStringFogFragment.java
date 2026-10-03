package mod.hey.studios.project.stringfog;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import pro.sketchware.databinding.FragmentStringfogManagerBinding;

public class ManageStringFogFragment extends BottomSheetDialogFragment {

    private FragmentStringfogManagerBinding binding;
    private StringfogHandler stringfogHandler;

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentStringfogManagerBinding.inflate(inflater, container, false);
        initializeLogic();
        return binding.getRoot();
    }

    private void initializeLogic() {
        stringfogHandler = new StringfogHandler(requireActivity().getIntent().getStringExtra("sc_id"));
        binding.swPgEnabled.setChecked(stringfogHandler.isStringfogEnabled());
        binding.swPgEnabled.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            stringfogHandler.setStringfogEnabled(isChecked);
            setStringFogStatus(isChecked);
        });
        binding.etKey.setText(stringfogHandler.getKey());
        binding.etKey.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                stringfogHandler.setKey(s.toString());
                updateKeyWarning();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        updateKeyWarning();
        setStringFogStatus(stringfogHandler.isStringfogEnabled());
    }

    /**
     * Shows a non-blocking warning when the key is the public default or
     * too short. The build is never blocked by this: old projects must
     * keep compiling.
     */
    private void updateKeyWarning() {
        if (stringfogHandler.isUsingDefaultKey()) {
            binding.tiKey.setError(null);
            binding.tiKey.setHelperText("Default key in use - anyone can decrypt your strings. "
                    + "Set a custom key for real protection.");
        } else if (!stringfogHandler.isKeyStrong()) {
            binding.tiKey.setHelperText(null);
            binding.tiKey.setError("Key too short - use at least "
                    + StringfogHandler.MIN_RECOMMENDED_KEY_LENGTH + " characters.");
        } else {
            binding.tiKey.setError(null);
            binding.tiKey.setHelperText(null);
        }
    }

    private void setStringFogStatus(boolean enabled) {
        binding.tiKey.setEnabled(enabled);
        binding.etKey.setEnabled(enabled);
        if (enabled) {
            binding.swPgEnabled.setText("StringFog is enabled");
        } else {
            binding.swPgEnabled.setText("StringFog is disabled");
        }
    }
}