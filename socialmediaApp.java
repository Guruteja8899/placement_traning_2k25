import java.util.*;
class Post{
    private String content;
    private Set<String> likedby = new HashSet<String>();

    public Post(String content){
        this.content = content;

    }
    public  void likepost(String userId) {
        if (likedby.add(userId)){
            System.out.println(userId+ "liked the post "+content+" ");
        }
        else{
            System.out.println(userId+"Already liked");
        }
    }
    public int getlikeCount(){
        return likedby.size();
    }
}
public class socialmediaApp {
    public static void main(String[] args) {
        Post post = new Post("BIrthday");
        post.likepost("guruteja_8");
        post.likepost("illu_billu");
        post.likepost("bharath_3");
        post.likepost("sai_98");
        post.likepost("mani_76");
        System.out.println("total likes :"+post.getlikeCount());
    }  
}
