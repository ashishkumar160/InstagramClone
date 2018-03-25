package com.apprensics.instagram;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ashish on 25/3/18.
 */

public class StoriesAdapter extends RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder> {

    private List<Story> storiesList;

    public class StoriesViewHolder extends RecyclerView.ViewHolder {
        public TextView name_text_view;
        public ImageView person_image_view;

        public StoriesViewHolder(View view) {
            super(view);
            name_text_view = view.findViewById(R.id.stories_list_textView);
            person_image_view = view.findViewById(R.id.stories_image);
        }
    }

    public StoriesAdapter(List<Story> storiesList) {
        this.storiesList = storiesList;
    }

    @Override
    public StoriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.stories_list_row, parent, false);
        return new StoriesViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(StoriesViewHolder holder, int position) {
        Story story = storiesList.get(position);
        holder.person_image_view.setImageResource(R.mipmap.ic_launcher_foreground);
        holder.name_text_view.setText(story.getName());
    }

    @Override
    public int getItemCount() {
        return storiesList.size();
    }
}
