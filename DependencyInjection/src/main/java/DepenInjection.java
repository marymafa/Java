public class DepenInjection {

    private User user;

    public  DepenInjection (User user){
        this.user = user;
        System.out.println(user);
    };
}
