package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator on 2016/10/11 0011.
 */
public class LianXi2 {
    String bname;
    int bid;
    int bprice;

    //LianXi2() {
    //    bname = "乱石穿空";
    //    bid = 322221;
    //    bprice = 42;
    //}
    LianXi2(int x,int y){
        bname = "乱石穿空";
        bid = 322221;
        bprice = 42;;

    }
}
    class LianXi3 extends LianXi2{
        String name1;
        LianXi3(int x,int y){
            super(x,y);

        }
        //LianXi3(LianXi3 b){
        //  super(b);
        //}
        public static void main(String[] args) {
            LianXi3 lianXi3=new LianXi3(0,1);
            System.out.println(lianXi3.bname);
            System.out.println(lianXi3.bid);
            System.out.println(lianXi3.bprice);



        }
    }

















