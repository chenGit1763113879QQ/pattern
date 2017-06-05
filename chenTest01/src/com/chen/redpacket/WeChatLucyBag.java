package com.chen.redpacket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class WeChatLucyBag {
       private int bagNum;
       private double totalMoney;
       private Date createDate;
       private long start;
       private long end;
       private List<Double> bag;
       private Map<String,Double> info;


       public WeChatLucyBag(int bagNum,double totalMoney){
           this.bagNum=bagNum;
           this.totalMoney=totalMoney;
           int tm=(int)(totalMoney*100);
           if(tm>20000){
               this.throwError("红包金额过大");
           }
           if(tm<=0){
               this.throwError("你玩我呢？？！");
           }
           if(tm<bagNum){
               this.throwError("单个红包不能小于1分");
           }
           //判断 一个包的情况

           {
             bag=new ArrayList<>();
             info=new HashMap<>();
             createDate=new Date();
           }
           if(bagNum==1){
               bag.add((totalMoney*100-0)/100.00);
               System.out.println(bag);
           }
           else{
               //有一个集合存储随机数 
               List<Integer> list=new ArrayList<>();
               Random r=new Random();
               while((bagNum-1)>list.size()){
                   int temp=r.nextInt(tm-2)+1;
                   if(!list.contains(temp)){
                       list.add(temp);
                   }
               }

               Collections.sort(list);
               bag.add((list.get(0)-0)/100.00);
               for(int i=1;i<list.size();i++){
                   bag.add((list.get(i)-list.get(i-1))/100.00); 
               }
               bag.add((tm-list.get(list.size()-1))/100.00);
               System.out.println(list);
           }
       }
       private void throwError(String text){
           throw new RuntimeException(text);
       }
       //分包  开包  检查 打印信息
       public void open(String name){
           if(bagNum==bag.size()){
               start=System.currentTimeMillis();
           }
           if(bagNum==0){
               end=System.currentTimeMillis();
               System.out.println("一共用了"+(end-start)/1000+"秒");
           }


            if(createDate.after(new Date(System.currentTimeMillis()-86400000))){
                if(bagNum!=0){
                    double money=bag.get(--bagNum);
                    System.out.println("恭喜你 抢到了"+money+"元"+'\n');
                    info.put(name,money);
                }else{
                    System.out.println("你手速慢了 红包都没啦");
                    showInfo();
                }
            }else{
                System.out.println("红包过期");
            }
       }

       public void showInfo(){
           for(Entry<String,Double> entry:info.entrySet()){
                System.out.println(entry.getKey()+"抢到了"+entry.getValue()+"元");
           }
           System.out.println();
       }
    public static void main(String[] args) {
        WeChatLucyBag  wb=new WeChatLucyBag(3,2);
        wb.open("haha");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        wb.open("heihie");
        wb.open("gaga");
        wb.open("kaka");
        wb.open("guagua");
    }
}