import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击间距中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
//int[]arr={1,2,3};
//String Arr= "abc";
//StringBuilder a= new StringBuilder();
//        for (int i = Arr.length()-1; i >= 0; i--) {
//            a.append(Arr.charAt(i));
//        }
//        System.out.println(a);
//        for (int i = 0; i < arr.length; i++) {
//            Arr.append(arr[i]);
//            if (i!=arr.length-1) {
//                Arr.append(",");
//                Arr.
//            }
//            else Arr.append("]");
//        }
//       String ARR= Arr.toString();
//   ;     System.out.println(Arr);
//        System.out.println(ARR);


//加密手机号码
//  String secretNumber=encrypt();
//        System.out.println(secretNumber);


//        身份证判断出生年月日以及性别等;
//        findMessage();

//替换
        Scanner sc = new Scanner(System.in);
//String replaced=replace(sc.next(),sc.next(),sc.next());
//        System.out.println(replace(sc.next(),sc.next(),sc.next()));
//StringBuilder sb=new StringBuilder();
//String s=sc.next();
//sb= new StringBuilder(s);
//        System.out.println(s.contentEquals(sb.reverse()));//或者s.equals(sb.reverse().toString())
        //一般会在字符串的拼接和反转的时候使用到StringBuilder.


//        StringJoiner sj=new StringJoiner(",","[","]");
//        sj.add("abc").add("123").add("ABC");
//        System.out.println(sj.length());
//        System.out.println(sj);



        //这是阿拉伯数字转换为罗马数字
//        String num=null;
//        while (true) {
//             num = sc.next();
//            if (check(num)) {
//              break;
//            }
//            else{
//                 System.out.println("输入错误请重新输入:");
//                continue;
//
//            }
//        }
////        transit(num);
////        System.out.println('0'+0);'0'的ascll码值为48;
//        System.out.println(toLuoMa(num));


        //接下来是调整字符串进行旋转即将首字母排到最后AB字符串看能不能通过旋转变得相同

//        String A=sc.next();
//        String B=sc.next();
//        System.out.println(
//                checkAB(A,B)
//        );





//        //打乱字符串
//        String s=sc.next();
//        String luan=daLuan(s);
//        System.out.println(luan);



        //给你两个字符串形式的数字让你求两个的和并且用字符串形式返回结果
//        String num1=sc.next();
//        String num2=sc.next();
//        int number1=toNumber(num1);
//        int number2=toNumber(num2);
//        String realNum=""+number1*number2;
//        System.out.println(realNum);






        //这个括号不要动!!!!!;
    }



    private static int toNumber(String num){
        int realNum=0;
        for (int i = 0; i < num.length(); i++) {
            realNum+=(num.charAt(i)-48);
            if (i!=num.length()-1) {
                realNum*=10;
            }
        }
        return  realNum;
    }



    private static String daLuan(String s){
        char[]arr=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            Random r=new Random();
int rand=r.nextInt(s.length());//这里犯错了, 没有用rand接收而是直接用r.nextInt(s.length()了导致了两次生成的随机数不一样导致错误
            char temp=arr[i];
            arr[i]=arr[rand];
            arr[rand]=temp;
        }
        return new String(arr);
    }




    private static boolean checkAB(String A,String B) {
        boolean flag=false;
        for (int i = 0; i < A.length(); i++) {
            String newA= A.substring(1)+ A.charAt(0);
            if (newA.equals(B)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    //StingJoiner


private static String toLuoMa(String num){
        String []luoMa={"","I","II","III","IV","V","VI","VII","VIII","IX"};
    String newNum = "";

    for (int i = 0; i < num.length(); i++) {
        System.out.println(luoMa[num.charAt(i)-48]);
        newNum+=luoMa[num.charAt(i)-48];
        newNum+=',';
    }
    return newNum;
}





private static boolean check(String num){
        if(num.length()>9){
            return false;
        }
    for (int i = 0; i < num.length(); i++) {
        if(num.charAt(i)<'0'||num.charAt(i)>'9'){
            return false;
        }
    }
    return true;
}




    //方法
    private static String encrypt(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要加密的手机号码:");
        String phoneNumber=sc.next();

        
        return phoneNumber.substring(0,3)+"****"+phoneNumber.substring(7,11);
    }
    private static void  findMessage(){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入身份证号:");
        String idCard=sc.next();
        System.out.print("该人于"+idCard.substring(6,10)+"年"+idCard.substring(10,12)+"月"+idCard.substring(12,14)+"日出生");
        if((idCard.charAt(16)-48)%2==0){
            System.out.println("性别为女");
        }
        else{
            System.out.println("性别为男");
        }
    }
    private static String replace(String str,String old,String newOne){
        return str.replace(old,newOne);
    }
}