package cn.create.model.single;

public class Main {
/*windows的任务管理器是单例模式，回收站是单例模式
*项目中，读取配置文件的也是单例模式
* 网站的计数器是单例模式，否则难以实现线程同步
* 应用程序的日志应用，也属于单例模式
* 数据库连接采用单例模式。操作系统的文件系统也是单例模式
* application也是典型的单例模式
* spring中，每一个bean的默认也是单例，优点是spring容器可以进行管理
*在servlet中，每个servlet也是单例
* springmvc和struts1框架中，控制器对象也是单例
 */
    public static void main(String[] args) {
	    Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(Single.INSTANCE==Single.INSTANCE);
        System.out.println(s1+""+s2);
    }
}
