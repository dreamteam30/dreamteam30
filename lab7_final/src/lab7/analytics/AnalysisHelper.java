/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lab7.entities.Comment;
import lab7.entities.User;
import java.util.Arrays;
import java.util.Map.Entry;
import lab7.entities.Post;
/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    // TODO
    public void userWithMostLikes(){
        Map<Integer,Integer> userlikesCount = new HashMap<>();
        Map<Integer,User> users = DataStore.getInstance().getUsers();   
        
        for(User user:users.values()){
            for(Comment c:user.getComments()){
                int likes = 0;
                if(userlikesCount.containsKey(user.getId()))
                    likes = userlikesCount.get(user.getId());
                likes+=c.getLikes();
                userlikesCount.put(user.getId(), likes);
                
            }
        }
        int max = 0;
        int maxId = 0;
        
        for(int id:userlikesCount.keySet()){
            if(userlikesCount.get(id)>max){
                max = userlikesCount.get(id);
                maxId = id;
            }
        }
        
        System.out.println("User with most likes: "+ max +"\n"+users.get(maxId));
    }
   
    public void getFiveMostLikedComment(){
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentlist = new ArrayList<>(comments.values());
         
        Collections.sort(commentlist, new Comparator<Comment>(){
            public int compare(Comment c1, Comment c2){
                return c2.getLikes()- c1.getLikes();
            }
        });
        System.out.println("5 most likes Comments: ");
        for(int i=0;i<commentlist.size()&&i<5;i++){
                System.out.println(commentlist.get(i)); 
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
            public int compare(Entry<Integer,Integer> c1, Entry<Integer,Integer> c2){
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
            public int compare(Entry<Integer,Integer> c1, Entry<Integer,Integer> c2){
                return c1.getValue() - c2.getValue();
            }
        });
        
        System.out.println("Top 5 inactive users based on total comments number: ");
        for(int i=0;i<userCommentCountList.size()&&i<5;i++){
                System.out.println("User: No."+userCommentCountList.get(i).getKey()+" Comments Number: "+userCommentCountList.get(i).getValue()); 
        }     
    }
       
       
       
       
   
}
