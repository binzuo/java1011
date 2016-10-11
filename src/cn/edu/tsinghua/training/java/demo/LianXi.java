package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator on 2016/10/11 0011.
 */
public class LianXi {
    public String color="粉红色";
    public void hu(){
        String color="咖啡色";
        System.out.println("她的外套是"+color+"的");
        System.out.println("她的外套是"+this.color+"的");

    }
    public static void main(String[] args) {
        LianXi xiaohong=new LianXi();
        xiaohong.hu();

    }
}
