package co.com.appinventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import co.com.appinventory.databinding.ActivityMain3Binding;



public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding mainBinding;
    private Button Register;
    private DbHelper dbHelper;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMain3Binding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(view);
        mainBinding.btnSignIn.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View view) {
        String email = mainBinding.edtEmail.getText().toString();
        String password = mainBinding.edtPassword.getText().toString();
        SQLiteDatabase SQLiteDatabase = dbHelper.getWritableDatabase();
        String query = String.format("SELECT * FROM users WHERE email='%s' and password='%s'",email,password);
        Cursor cursor = SQLiteDatabase.rawQuery(query,null);

        if(cursor.getCount() > 0){
            Toast.makeText(this,"El usuario ya existe",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this,RegisterActivity.class);
            startActivity(intent);
        }
        cursor.moveToNext();
    }

    public void goRegisterUser(View view){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
}