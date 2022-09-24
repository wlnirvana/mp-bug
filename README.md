# MyBatis Bug(?) Report

**TL;DR**: `saveBatch`在IdType为auto模式下，存入数据库后，不能正确更新集合中元素的id

## 复现

运行此项目，然后访问`http://localhost:9000/saveBatch`和`http://localhost:9000/saveOneByOne`，会看到二者的行为并不一致。其中，`saveBatch`比较反常，`saveOneByOne`是预期的行为。

## 环境

- macOS 11.5.2
- AdoptOpenJDK (build 11.0.8+10)