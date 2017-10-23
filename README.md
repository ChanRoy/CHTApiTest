# CHTApiTest
基于Servlet的APP后台接口开发初探

## 前言
作为一名iOS开发者，一直想了解一下APP后台接口数据获取的实现过程。于是花了点时间学习了一下JAVA语言，依据教程简单实现了这个小DEMO。

实现了当发起接口请求时，Server Web Application 将数据库表中的数据读出，以JSON格式返回给接口请求方。

## 开发环境

- java version "1.8.0_05"
- Eclipse SDK Version: Neon (4.6)
- Navicat for MyQFL Version 9.1.3

## 成果
将数据库中`student`表中的数据以JSON格式输出，例如在浏览器中输入：

```
http://localhost:8080/CHTApiTest/StudentInq
```

将会返回以下格式的数据：

```
{
	code: "ok",
	msg: "访问成功",
	time: 1508746551695,
	itesm: [
				{
					id: 1,
					name: "zhangsan",
					age: 12,
					sex: 0,
					mobile: 21156464
				},
				{
					id: 2,
					name: "lisi",
					age: 13,
					sex: 1,
					mobile: 13454640
				},
				{
					id: 3,
					name: "wangwu",
					age: 23,
					sex: 0,
					mobile: 13545648
				}
			]
}
```

## 参考文献
1. [java web开发(二) 接口开发](http://blog.csdn.net/zxw136511485/article/details/51437115)
2. [JSON 使用讲解](http://blog.csdn.net/zxw136511485/article/details/51437582)
3. [Servlet 教程](http://www.runoob.com/servlet/servlet-tutorial.html)

## License
MIT