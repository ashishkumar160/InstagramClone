package com.apprensics.instagram;

/**
 * Created by ashish on 25/3/18.
 */

public class Feed {
    private String name, location, profileImageUrl, likes, commentCount, authorComment;
    private int days, photoUrl;

    public Feed() {
    }

    public Feed(String name, String location, String profileImageUrl,int photoUrl, String likes, String commentCount, String authorComment, int days) {
        this.name = name;
        this.location = location;
        this.profileImageUrl = profileImageUrl;
        this.photoUrl = photoUrl;
        this.likes = likes;
        this.commentCount = commentCount;
        this.authorComment = authorComment;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public int getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(int photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getAuthorComment() {
        return authorComment;
    }

    public void setAuthorComment(String authorComment) {
        this.authorComment = authorComment;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
