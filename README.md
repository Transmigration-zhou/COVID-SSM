# COVID-SSM
校园疫情防控打卡系统

Spring+SpringMVC+Mybatis

## 问题分析

### 项目背景
新型冠状病毒的爆发，学校很难掌握学生每天的健康状态以及学生的出行情况。疫情防控工作举步维艰。

### 要解决的问题
本系统需要实现获取学生每天的状态信息以及出行信息，通过健康码的方式快速确认学生健康状态。学院老师以及管理员可以查看汇总的数据，并所有学生的状态以及实现对异常学生的快速查询。

### 项目目标
(1)	完成项目的大部分功能，以及前端的大致设计。

(2)项目要完成基本的登陆、登记、统计数据的功能。

(3)采用MVC模式，代码结构逻辑清晰，实现模块高内聚。

## 主要功能分析
### 用户角色
- 学生
- 老师
- 管理员

### 角色功能简述
学生：查询健康码状态、每日打卡、查询自己的打卡记录、申请离校、查看个人资料、修改密码、修改手机号。

老师：查询负责学院的学生打卡情况和学生状态和信息、处理负责学院的学生离校申请、修改个人资料。

管理员：查询全校的学生状态和打卡记录、查询所有学生和老师的信息、添加用户、修改个人资料。

## 主要用例和流程图

