import java.util.Date;
import java.util.List;

/**
 * 加载类
 * @author Administrator
 */
public class allen extends Date{
   // private static final long serialVersionUID = 8627644427315706176L;
    //打印数据
    @Override
    public String toString(){
        return "Hello ClassLoader!";
    }
    public static void main(String[] args){
        System.out.println("List类的加载器的名称:"+List.class.getClassLoader());
    }

}