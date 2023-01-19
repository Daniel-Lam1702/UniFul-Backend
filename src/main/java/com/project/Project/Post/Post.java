package com.project.Project.Post;

import com.project.Project.User.User;

public class Post {
    private String title;
    private String content;
    private final int postId; //post id and the poster will never change :3
    private final User poster;

    public Post(String title, String content, User poster, int postId){
        this.title = title;
        this.content = content;
        this.postId =  postId;
        this.poster = poster;
    }

    public String getContent(){
        return content;
    }

    public String getTitle(){
        return title;
    }
    public int getPostId(){
        return postId;
    }
    public User getPoster(){
        return poster;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }
    public void setContent(String newContent){
        content = newContent;
    }

}
