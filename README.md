# 1、数据结构和算法
线性结构：数组、链表、队列、栈<br/>
非线性结构：二维数组、多维数组、广义表、树、图<br/>
[Java常用数据结构](https://github.com/yeyunzaifufan/leetcode-java/wiki/%E5%B8%B8%E7%94%A8%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84)
## 1.1、稀疏数组
### 1.1.1、介绍
当一个数组中大部分元素为0，或者为同一个值时，可以用稀疏数组来保存该数组。

稀疏数组的处理方法：
1. 记录数组有几行几列，有多少个不同于0（或众数元素）的值
2. 把具有不同值的元素的行列及值记录在一个小规模数组中，从而缩小程序的规模
### 1.1.2、实例
[稀疏数组](https://github.com/yeyunzaifufan/leetcode-java/blob/master/algorithms/src/cn/xinghaibay/sparsearray/SparseArray.java)

## 1.2、队列
### 1.2.1、介绍
1. 队列是一个有序列表，可以用数组或链表来实现
2. 遵循先入先出的原则
### 1.2.2、实例
[数组队列](https://github.com/yeyunzaifufan/leetcode-java/blob/master/algorithms/src/cn/xinghaibay/queuearray/QueueArray.java)<br/>
[环形数组队列](https://github.com/yeyunzaifufan/leetcode-java/blob/master/algorithms/src/cn/xinghaibay/queuearray/CircleArray.java)

## 1.3、链表
### 1.3.1、介绍
1. 链表是以节点的方式来存储，是链式存储
2. 每个节点包含data域，next域
3. 各个节点不一定连续存储
### 1.3.2实例
[单链表](https://github.com/yeyunzaifufan/leetcode-java/blob/master/algorithms/src/cn/xinghaibay/linkedlist/SingleLinkedList.java)<br/>
[双向链表](https://github.com/yeyunzaifufan/leetcode-java/blob/master/algorithms/src/cn/xinghaibay/linkedlist/DoubleLinkedList.java)<br/>
[单向环形链表](https://github.com/yeyunzaifufan/leetcode-java/blob/master/algorithms/src/cn/xinghaibay/linkedlist/CircleSingleLinkedList.java)