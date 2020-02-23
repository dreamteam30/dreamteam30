/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    public void getAverageLikesComment(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();       
        List<Comment> commentlist = new ArrayList<>(comments.values());
        
        int likesSum=0;
        for(int i=0;i<commentlist.size();i++){
            likesSum+=commentlist.get(i).getLikes();
        }
        int averageLikes=likesSum/commentlist.size();
        System.out.println("Average number of likes per comment: "+averageLikes);
    }
    
       public void getPostWithMostLikesComment(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentlist = new ArrayList<>(comments.values());
         
        Collections.sort(commentlist, new Comparator<Comment>(){
            public int compare(Comment c1, Comment c2){
                return c2.getLikes()- c1.getLikes();
            }
        });
        
        for(Post post:posts.values()){
            if(commentlist.get(0).getPostId()==post.getPostId()){
                System.out.println("the post with most liked comments: No."+post.getPostId());
                return;
            }
        }
    }
       
       
        public void getPostWithMostComment(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentlist = new ArrayList<>(comments.values());

        int maxComment=0;
        for(Post post:posts.values()){
            if(post.getComments().size()>maxComment){
                maxComment=post.getComments().size();
            }
        }
        
        for(Post post:posts.values()){
            if(post.getComments().size()==maxComment){
                System.out.println("the post with most comments: No."+post.getPostId());
            }
        }
    } 
       
       
        public void Top5InactiveUsersOnTotalPostsNumber(){       
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<Integer,Integer> userPostCount = new HashMap<>();
               
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Post> postList = new ArrayList<>(posts.values());
     
        
        for(User user:users.values()){
            int count = 0;
            for(Post post:postList){
                if(post.getUserId()==user.getId()){             
                    count++;
                    userPostCount.put(user.getId(), count);              
                }
            }         
        }
        List<Map.Entry<Integer,Integer>> userPostCountList = new ArrayList<>(userPostCount.entrySet());
        Collections.sort(userPostCountList, new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer,Integer> c1, Map.Entry<Integer,Integer> c2){
                return c1.getValue() - c2.getValue();
            }
        });
        
        System.out.println("Top 5 inactive users based on total posts number: ");
        for(int i=0;i<userPostCountList.size()&&i<5;i++){
                System.out.println("User: No."+userPostCountList.get(i).getKey()+" Post Number: "+userPostCountList.get(i).getValue()); 
        }     
    }
       
        public void getFiveMostInactiveUsersOnCommentNumberMethod1(){       
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        Map<Integer,Integer> userCommentCount = new HashMap<>();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        for(User user:users.values()){
            int count = 0;
            for(Comment comment:commentList){
                if(comment.getUserId()==user.getId()){             
                    count++;
                    userCommentCount.put(user.getId(), count);              
                }
            }         
        }
        List<Map.Entry<Integer,Integer>> userCommentCountList = new ArrayList<>(userCommentCount.entrySet());
        Collections.sort(userCommentCountList, new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer,Integer> c1, Map.Entry<Integer,Integer> c2){
                return c1.getValue() - c2.getValue();
            }
        });
        
        System.out.println("Top 5 inactive users based on total comments number: ");
        for(int i=0;i<userCommentCountList.size()&&i<5;i++){
                System.out.println("User: No."+userCommentCountList.get(i).getKey()+" Comments Number: "+userCommentCountList.get(i).getValue()); 
        }     
    }
    
    
    
    
    
    
    
    
    
    
    
}
