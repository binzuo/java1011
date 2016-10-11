package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator on 2016/10/11 0011.
 */
public class LianXi5 extends LianXi4{

    int y;

    void method1(){
        y=x+x;
        System.out.println(y);


    }
    LianXi5(){
        super(2.0);

    }





    public static void main(String[] args) {
        LianXi5 lianXi5=new LianXi5();
        lianXi5.method1();
        lianXi5.method();
        System.out.println(lianXi5.x);

    }
}
