package lb.edu.aub.fyp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText TextUsername, TextPassword;
    Button buttonSignUp;

    DatabaseReference databaseUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseUsers = FirebaseDatabase.getInstance().getReference("Users");

        TextUsername = (EditText)findViewById(R.id.TextUsername);
        TextPassword = (EditText)findViewById(R.id.TextPassword);
        buttonSignUp = (Button)findViewById(R.id.buttonSignUp);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
    }

    private void signIn() {
        String username = TextUsername.getText().toString().trim();
        String password = TextPassword.getText().toString().trim();
    }
        private void signUp() {
        String username = TextUsername.getText().toString().trim();
        String password = TextPassword.getText().toString().trim();
        String first_name = TextFirstName.getText().toString().trim();;
        String last_name = TextLastName.getText().toString().trim();
        int phone_number = TextNumber.getText().toString().trim();
        String address = TextAddress.getText().toString().trim();
        String email = TextEmail.getText().toString().trim();
        int user_id = TextUserId.getText().toString().trim();
        int sex = TextSex.getText().toString().trim();

        if(!TextUtils.isEmpty(username)) {
            String id = databaseUsers.push().getKey();

            User user = new User(username, first_name, last_name, phone_number, address, email, sex, user_id);

            databaseUsers.child(id).setValue(user);

            Toast.makeText(this, "User added", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this, "You should enter a username", Toast.LENGTH_LONG).show();
        }
    }

    private void addUsers() {
        String username;
        String first_name;
        String last_name;
        int phone_number;
        String address;
        String email;
        int user_id;
        int sex;
    }

}