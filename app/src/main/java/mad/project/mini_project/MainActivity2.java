package mad.project.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity2 extends AppCompatActivity {

    TextInputEditText nam,pass;
    Button button;
    TextInputLayout pa,na;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nam=findViewById(R.id.username);
        pass=findViewById(R.id.password);
        button=findViewById(R.id.button);
        String a=nam.getText().toString();
        pa=findViewById(R.id.pass);
        na=findViewById(R.id.usernamel);

        nam.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                Toast.makeText(MainActivity2.this, "Allow onlt charcter", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                Toast.makeText(MainActivity2.this, "Allow onlt charcter", Toast.LENGTH_SHORT).show();
//              if() {
//                    na.setError("Allow onlt charcter");
//                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
//                Toast.makeText(MainActivity2.this, "Allow onlt charcter", Toast.LENGTH_SHORT).show();
                if(!a.matches("[a-zA-Z ]+")){
                    na.setError("dasdasd");
//                    Toast.makeText(MainActivity2.this, "Allow onlt charcter", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}