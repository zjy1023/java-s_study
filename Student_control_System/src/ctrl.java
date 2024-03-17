import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ctrl {
    public static void main(String[] args) {
        zhanghao newOne=new zhanghao();
        Scanner s=new Scanner(System.in);
        first:while (true) {
            System.out.println("欢迎,请选择   1:注册   2:登录    3:忘记密码" +   "  4退出");

            switch (s.nextInt()){
                case 1->register(newOne);
                case 2-> {
                    if (login(newOne)) {
                        Login(newOne);
                    }

                    else{
                        System.out.println("登录失败!");
                    }

                }
                case 3->forget(newOne);

                case 4 -> {
                    break first;
                }

            }
        }


    }


    //主函数界 请方法不要越界哦!!!



    private static void forget(zhanghao newOne) {
        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎来到忘记密码界面,首先请确认此前已注册过账号并且忘记了密码");
        System.out.println("如果进错了请按4退出,否则按其他键");
        if (sc.nextInt() == 4) {
            return;
        }
        System.out.println("首先请校验身份确保安全");
        int i=3;
        while(i>=1){

        System.out.println("请输入身份证号码:");
        if (Objects.equals(newOne.idNumber, sc.next())) {
            System.out.println("请输入手机号:");
            if (Objects.equals(newOne.phoneNumber, sc.next())) {
                System.out.println("发送验证码");
                System.out.println("检验验证码");
                System.out.println("修改用户名或者密码");
                System.out.println("已完成操作,请前往登录!");
                break;
            } else {
                System.out.println("手机号码错误哦!");
                i--;
                System.out.println("还剩" +
                        i+"次机会");
            }
        } else {
            System.out.println("身份证号码错误!");
            i--;
            System.out.println("还剩" +
                    i+"次机会");
        }
    }
        if (i<1) {
            System.out.println("机会用完了,账号存在风险,忘记密码操作失败!");
        }
    }




    private static void Login(zhanghao newOne) {
        ArrayList<Student> stu=new  ArrayList<>();
        Scanner sc=new Scanner(System.in);
        flag:while(true) {
            System.out.println("已成功登录进入学生管理系统:");
            System.out.println("请选择:");
            System.out.println("1:增");
            System.out.println("2:删");
            System.out.println("3:改");
            System.out.println("4:查");
            System.out.println("按其他键则退出");
            switch (sc.nextInt()) {
                case 1:
                    add(stu);
                    break;
                case 2:
                    delete(stu);
                    break;
                case 3:
                    find(stu);
                    break;
                case 4:
                    set(stu);
                    break;
                default:
                    break flag;
            }
        }
    }

    private static void add(ArrayList<Student> stu){
        Student temp=new Student();
        System.out.println("请输入你要添加学生的信息:");
        System.out.println("请输入学生姓名:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        temp.name=name;

        System.out.println("请输入学生id:");
        String id=sc.next();
        temp.id=id;
        System.out.println("请输入学生省份:");
        String address=sc.next();
        temp.address=address;
        stu.add(temp);

    }
    private static void delete(ArrayList<Student> stu){

    }
    private static void find(ArrayList<Student> stu){
        System.out.println(" id           name       address");
        for (int i = 0; i < stu.size(); i++) {
            System.out.println(i+" : "+stu.get(i).id+"      "+stu.get(i).name+"      "+
                    stu.get(i).address);
        }
    }
    private static void set(ArrayList<Student> stu){

    }
    private static void register(zhanghao newOne){
        System.out.println("欢迎来到注册界面:");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的身份证号码:");
        newOne.idNumber=sc.next();
        System.out.println(
                "请输入你的手机号码:"
        );
        newOne.phoneNumber =sc.next();
        System.out.println("请输入你的用户名:");
        newOne.userName=sc.next();
        String passWorld;
        while(true) {
            System.out.println("请输入你要设置的密码:");
            passWorld = sc.next();
            newOne.passWorld = passWorld;
            System.out.println("请再次输入密码进行确认:");
            if (Objects.equals(passWorld, sc.next())) {
                System.out.println("注册成功!");
                break;
            } else {
                System.out.println("第二次输入密码与第一次不同请选择合适密码");
            }
        }
    }


    private static boolean login(zhanghao newOne){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名:");
        if(Objects.equals(newOne.userName, sc.next())){
            System.out.println("请输入密码:");
            if(Objects.equals(newOne.passWorld,sc.next())){
                System.out.println(
                        "登录成功!"

                );
                return true;
            }
            else{
                System.out.println("密码错误!");
                return false;
            }
        }
        else{
            System.out.println("用户名都错了!");
            return false;
        }

    }





}
