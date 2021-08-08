package android.example.facebook.ui.main;

import android.example.facebook.R;
import android.example.facebook.pojo.PostModel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder>  {

    private ArrayList<PostModel> postsList = new ArrayList<>();


    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        holder.titleTV.setText(postsList.get(position).getTitle());
        holder.userIDTV.setText(postsList.get(position).getUserId()+"");
        holder.bodyTV.setText(postsList.get(position).getBody());
    }



    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public void setList(ArrayList<PostModel> postsList) {
        this.postsList= postsList;
        notifyDataSetChanged();

    }


    public class PostViewHolder extends RecyclerView.ViewHolder {

        TextView titleTV, userIDTV, bodyTV;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTV=itemView.findViewById(R.id.titleTV);
            userIDTV=itemView.findViewById(R.id.userIDTV);
            bodyTV=itemView.findViewById(R.id.bodyTV);
        }
    }
}
