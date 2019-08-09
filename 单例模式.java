```java
单例模式：一个类只允许实例化一个对象
一般步骤：
	1.构造方法私有化
	2.在类的内部new出一个对象（private static）
	3.静态的获取对象的get方法
	
//懒汉式
class SingLeton {
    private static volatile SingLeton singLeton = null;
    //构造方法私有化，类的外部不能实例化对象
    private SingLeton() {}
    //类的静态方法获取类的唯一对象
    public static SingLeton getSingLeton() {
        if(null == singLeton) {
            synchronized(SingLeton.class) {
                if(null == singLeton) {
                    //类的内部new出唯一的实例化对象
                    singLeton = new SingLeton();
                }
            }
        }
        return singLeton;
    }
}

//饿汉式
class SingLetonH {
    //类的内部new出唯一的实例化对象
    private static final SingLetonH singLetonH = new SingLetonH();
    //构造方法私有化
    private SingLetonH() {}
    //类的静态方法，获取到类的实例化对象
    public static SingLetonH getSingLetonH() {
        return singLetonH;
    }
}
```