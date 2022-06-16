package co.com.appinventory;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import co.com.appinventory.databinding.ActivityMain3Binding;
import co.com.appinventory.databinding.ActivityRegister2Binding;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegister2Binding register2Binding;
    private DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        register2Binding = ActivityRegister2Binding.inflate(getLayoutInflater());
        View view = register2Binding.getRoot();
        setContentView(view);
        dbHelper = new DbHelper(this);
    }

    public void registerUser(View view) {


        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues userData = new ContentValues();
        String name = register2Binding.etName.getText().toString();
        String identification = register2Binding.etNumber.getText().toString();
        String email = register2Binding.etEmail.getText().toString();
        String password = register2Binding.etPassword.getText().toString();
        userData.put("name", name);
        userData.put("identification", identification);
        userData.put("email", email);
        userData.put("password", password);
        long newUser = db.insert("users", null, userData);
        if ((name == null) || (email == null) || (identification == null) || (password == null)) {
            Toast.makeText(this, "" + newUser, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, " Inicie Sesión" + newUser, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
        }
    }
    public void back(View view){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}
