# kava-jvm

## 002 Java运行流程

1. .java代码文件编译为.class字节码文件
2. 类加载器把.class字节码人间中的类加载到JVM中
3. JVM执行类中代码

## 003 类加载机制
- 加载
- 验证
- 准备
- 解析
- 初始化
- 使用
- 卸载


### 准备阶段：验证、准备、解析
1. 验证阶段 

这一步就是根据Java虚拟机规范，来校验你加载进来的.class文件中的内容，是否符合指定的规范。

2. 准备阶段

给加载进来的类分配一定的内存空间，然后给里面的类变量(static修饰的变量)分配内存空间，来一个默认的初始值

3.解析阶段

将符号引用替换为直接引用的过程

### 核心阶段：初始化

#### 什么是类初始化？
执行静态常量赋值操作，以及静态代码块

类的初始化规则
1. new来实例化类的对象，会触发类的加载到初始化的全过程，把这个类准备好，在实例化一个对象
2. main()方法的主类，必须马上初始化
3. 如果初始化一个类的时候，发现他的父类还没初始化，那么必须先初始化父类。


#### 类加载器和双亲委派机制

##### 类加载器

- 启动类加载器 Bootstrap ClassLoader

负责加载Java目录下lib中的核心类库

- 扩展类加载器 Extension ClassLoader

负责加载Java目录下lib\ext目录

- 应用程序类加载器

负责加载ClassPath环境变量所指定的路径中的类

- 自定义类加载器

可以自定义类加载器，根据自己的需求去加载类


##### 双亲委派机制
JVM的类加载是有亲子层级结构，启动类加载器是最上层，扩展类加载器第二层，应用类加载器第三层，自定义类加载器最后一层。
假设程序类加载器需要加载一个类，首先会委派给自己的父类加载器去加载，最终传递到顶层的类加载器中加载。如果父类加载器在
自己负责加载的范围内没有找到，会下推加载权利给自己的子类加载器。


## 004 JVM内存分区

- 存放类的方法区

JDK1.8之前，是JVM中的一块区域。从.class文件里加载进来的类，还有一些类似常量池的东西放在这个区域。

JDK1.8之后，改为Metaspace，元数据空间。主要还是存放自己写的各种类的相关信息。

- 执行代码指令用的程序计数器

程序计数器用于记录当前执行的字节码指令的位置，也就是记录目前执行到了哪一个字节码指令。

- 虚拟机栈

JVM用虚拟机栈来保存每个方法内的局部变量等数据。每个线程都有自己的Java虚拟机栈。
如果线程执行了一个方法，就会对这个方法调用创建对应的一个栈帧。
栈帧有这个方法的局部变量表、操作数栈、动态链接、方法出口等。
方法执行完毕之后就出栈。

- 堆内存

存放代码中创建的各种对象。









































