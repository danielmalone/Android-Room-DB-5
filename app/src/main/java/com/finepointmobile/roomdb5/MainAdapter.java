package com.finepointmobile.roomdb5;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by danielmalone on 5/31/17.
 */

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private List<User> mUsers;

    public MainAdapter(List<User> users) {
        mUsers = users;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        holder.mFirstName.setText(mUsers.get(position).getFirstName());
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mFirstName;

        public ViewHolder(View itemView) {
            super(itemView);

            mFirstName = (TextView) itemView.findViewById(R.id.first_name);
        }
    }
}
