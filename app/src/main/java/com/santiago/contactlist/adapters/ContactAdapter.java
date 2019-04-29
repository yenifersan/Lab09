package com.santiago.contactlist.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.santiago.contactlist.R;
import com.santiago.contactlist.activities.DetailContactActivity;
import com.santiago.contactlist.models.Contact;

import java.util.ArrayList;
import java.util.List;

//el adaptador  viewhodlder representa al xml
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder>{

    private static final String TAG = ContactAdapter.class.getSimpleName();
    private AppCompatActivity activity;
    private List<Contact> contacts;

    public ContactAdapter(AppCompatActivity activity){
        contacts= new ArrayList<>();
this.activity= activity;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_contact,viewGroup, false);
        return  new ViewHolder(view);
    }

    //
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        final Contact contact= this.contacts.get(position);


        viewHolder.fullname.setText(contact.getFullname());
        viewHolder.emailText.setText(contact.getEmail());


        //imagen
        Context context= viewHolder.itemView.getContext();
        int resourceid = context.getResources().getIdentifier(
                contact.getPicture(),"drawable", context.getPackageName()
        );
        viewHolder.pictureImage.setImageResource(resourceid);

        // definiendo el evento onclick
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onclick" + contact);

                Intent intent = new Intent(v.getContext(), DetailContactActivity.class);
                intent.putExtra("id",contact.getId());

                activity.startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return contacts.size();
    }

    class  ViewHolder extends RecyclerView.ViewHolder{
    ImageView pictureImage;
    TextView fullname;
    TextView emailText;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
     fullname= itemView.findViewById(R.id.fullname_text);
     emailText= itemView.findViewById(R.id.email_text);
     pictureImage= itemView.findViewById(R.id.picture_image);


    }
}
}
