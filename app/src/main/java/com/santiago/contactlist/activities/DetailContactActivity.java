package com.santiago.contactlist.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.santiago.contactlist.R;
import com.santiago.contactlist.models.Contact;
import com.santiago.contactlist.repositories.ContactRepository;

public class DetailContactActivity extends AppCompatActivity {
private Integer id;
private ImageView pictureImage;
private TextView fullname;
private TextView email;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_contact);

        pictureImage = findViewById(R.id.picture_image);
        fullname = findViewById(R.id.fullname_text);
        email = findViewById(R.id.email_text);

        this.id= getIntent().getExtras().getInt("id");

        //recuperar el contacto

        Contact contact= ContactRepository.getContactById(id);

        if (contact !=null){
            int resourceid = getResources().getIdentifier(
                    contact.getPicture(),
                    "drawable",
                    getPackageName()
            );
            pictureImage.setImageResource(resourceid);
            fullname.setText(contact.getFullname());
            email.setText(contact.getEmail());
        }
    }
}
