# JavaEE 上课笔记

## 前言

> 学JavaEE需要耐心

### 第一节课

#### 第一个程序

- 新建工程

	- 初始界面 选择新建工程
		![image-20210315091927061](JavaEE%20%E4%B8%8A%E8%AF%BE%E7%AC%94%E8%AE%B0.assets/image-20210315091927061.png)

	- 设置工程信息
		![image-20210315092250374](JavaEE%20%E4%B8%8A%E8%AF%BE%E7%AC%94%E8%AE%B0.assets/image-20210315092250374.png)

	- 选择安装的包
		![image-20210315092306568](JavaEE%20%E4%B8%8A%E8%AF%BE%E7%AC%94%E8%AE%B0.assets/image-20210315092306568.png)

	- 选择存放位置![image-20210315092350388](JavaEE%20%E4%B8%8A%E8%AF%BE%E7%AC%94%E8%AE%B0.assets/image-20210315092350388.png)

	- 正在下载 (右下角)
		![image-20210315092448032](JavaEE%20%E4%B8%8A%E8%AF%BE%E7%AC%94%E8%AE%B0.assets/image-20210315092448032.png)

	- 等待下载
		![image-20210315092712008](JavaEE%20%E4%B8%8A%E8%AF%BE%E7%AC%94%E8%AE%B0.assets/image-20210315092712008.png)

	- 下载完成后的树形结构 以及相对应的文件(没有标红即可)
		![image-20210315094413492](JavaEE%20%E4%B8%8A%E8%AF%BE%E7%AC%94%E8%AE%B0.assets/image-20210315094413492.png)

	- 新建目录并创建文件 编写代码
		![image-20210315102727246](JavaEE%20%E4%B8%8A%E8%AF%BE%E7%AC%94%E8%AE%B0.assets/image-20210315102727246.png)

		```java
		/*
			控制器Controller的作用: 在SpringMVC 中，控制器Controller 负责处理由DispatcherServlet 分发的请求，它把用户请求的数据经过业务处理层处理之后封装成一个Model ，然后再把该Model 返回给对应的View 进行展示。在SpringMVC 中提供了一个非常简便的定义Controller 的方法，你无需继承特定的类或实现特定的接口，只需使用@Controller 标记一个类是Controller ，然后使用@RequestMapping 和@RequestParam 等一些注解用以定义URL 请求和Controller 方法之间的映射，这样的Controller 就能被外界访问到。此外Controller 不会直接依赖于HttpServletRequest 和HttpServletResponse 等HttpServlet 对象，它们可以通过Controller 的方法参数灵活的获取到。
		*/
		```

		> ```java
		> package com.hziee.javaee0315.controller;
		> 
		> import org.springframework.stereotype.Controller;
		> 
		> @Controller
		> public class UserController {
		>     
		> }
		> ```

	- 编写UserController的代码

		> ```java
		> package com.hziee.javaee0315.controller;
		> import org.springframework.stereotype.Controller;
		> import org.springframework.web.bind.annotation.RequestMapping;
		> import org.springframework.web.bind.annotation.RestController;
		> @Controller //用于到template中找到同名的文件
		> //@RestController // 用于返回json格式的数据或者字符串
		> public class UserController {       // 控制器是所有请求访问的第一道关
		>     @RequestMapping("/showLogin")        // 请求映射(请求名) URL进行请求如果匹配则进入注解下的函数(方法)
		>     public String showLogin(){
		>         return "login";     // 指定了跳转的页面
		>     }
		>     @RequestMapping("/showRegister")
		>     public String showRegister(){
		>         return "register";
		>     }
		> }
		> ```

	- 

	- 注意事项:

		- 一般而言 包名用英文小写为宜 类名为单词首字母大写为宜
		- @xxx 表示注解(注入+解释), 告诉你什么功能并解释运行以下代码
			- 不需要全部记, 核心的注解需要记住 以后可能会用到
		- 不懂的东西要尽快百度等方式解决
		- 前后端分离,避免了前后端的争执 定义接口即可 但是成本高 一般用于大公司; 前后端不分离 一般用于小公司

	- 目录详解:

		- template: 用于存放网页
		- static: 用于存放网页资源
		- application.properties: 配置文件