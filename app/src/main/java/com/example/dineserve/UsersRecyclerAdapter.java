package com.example.dineserve;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.text.CollationElementIterator;
import java.util.List;

class UsersRecyclerAdapter  extends RecyclerView.Adapter<UsersRecyclerAdapter.UserViewHolder> {

    private List<User> listUsers;

    public UsersRecyclerAdapter(List<User> listUsers) {
        this.listUsers = listUsers;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user_recycler, parent, false);

        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.textViewName.setText(listUsers.get(position).getName());
        holder.textViewEmail.setText(listUsers.get(position).getEmail());
        holder.textViewPassword.setText(listUsers.get(position).getPassword());
        holder.textViewMobileNumber.setText(listUsers.get(position).getPhonenumber());
        holder.textViewPlace.setText(listUsers.get(position).getAddress());
        holder.textViewPanNumber.setText(listUsers.get(position).getPannumber());
        holder.textViewAdhaarNumber.setText(listUsers.get(position).getAdhaarNumber());
    }

    @Override
    public int getItemCount() {
        Log.v(UsersRecyclerAdapter.class.getSimpleName(),""+listUsers.size());
        return listUsers.size();
    }


    /**
     * ViewHolder class
     */
    public class UserViewHolder extends RecyclerView.ViewHolder {

        public AppCompatTextView textViewName;
        public AppCompatTextView textViewEmail;
        public AppCompatTextView textViewPassword;
        public AppCompatTextView textViewMobileNumber;
        public AppCompatTextView textViewPlace;
        public AppCompatTextView textViewPanNumber;
        public AppCompatTextView textViewAdhaarNumber;

        public UserViewHolder(View view) {
            super(view);
            textViewName = (AppCompatTextView) view.findViewById(R.id.textViewName);
            textViewEmail = (AppCompatTextView) view.findViewById(R.id.textViewEmail);
            textViewPassword = (AppCompatTextView) view.findViewById(R.id.textViewPassword);
            textViewMobileNumber=(AppCompatTextView)view.findViewById(R.id.textViewMobileNumber);
            textViewPlace=(AppCompatTextView)view.findViewById(R.id.textViewPlace);
            textViewPanNumber=(AppCompatTextView)view.findViewById(R.id.textViewPanNumber);
            textViewAdhaarNumber=(AppCompatTextView)view.findViewById(R.id.textViewAdhaarNumber);
        }
    }



}
