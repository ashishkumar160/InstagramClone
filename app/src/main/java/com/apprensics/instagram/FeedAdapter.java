package com.apprensics.instagram;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by ashish on 25/3/18.
 */

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedViewHolder> {

    private List<Feed> feedList;

    public class FeedViewHolder extends RecyclerView.ViewHolder {
        public TextView namefeedTextView, locationfeedTextView, likesTextView, commentTextView, daysTextView;
        public CircleImageView profileImageView;
        public ImageView photoImageView;

        public FeedViewHolder(View view) {
            super(view);
            namefeedTextView = view.findViewById(R.id.name_feed);
            locationfeedTextView = view.findViewById(R.id.location_feed);
            likesTextView = view.findViewById(R.id.likes_feed_text_view);
            commentTextView = view.findViewById(R.id.comment_feed_text_view);
            daysTextView = view.findViewById(R.id.days_feed_text_view);
            profileImageView = view.findViewById(R.id.image_feed);
            photoImageView = view.findViewById(R.id.photo_feed);
        }
    }

    public FeedAdapter(List<Feed> feedList) {
        this.feedList = feedList;
    }

    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.feed_list_row, parent, false);
        return new FeedViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FeedViewHolder holder, int position) {
        Feed feed = feedList.get(position);
        holder.photoImageView.setImageResource(feed.getPhotoUrl());
        holder.profileImageView.setImageResource(R.drawable.photo);
        holder.daysTextView.setText(feed.getDays() + " DAYS AGO");
        holder.commentTextView.setText(feed.getCommentCount());
        holder.likesTextView.setText(feed.getLikes());
        holder.locationfeedTextView.setText(feed.getLocation());
        holder.namefeedTextView.setText(feed.getName());
    }

    @Override
    public int getItemCount() {
        return feedList.size();
    }
}
