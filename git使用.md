<h2>仓库创建和入库操作</h2>
### 设置用户名密码

*git config --global user.email "xxxx"*

*git config -- global user.name "xxxx"*

*git config --global --list*   查看配置结果

*git inti*          初始化git仓库

### 将文件添加到仓库

*git add xxx*                        添加xxx文件到暂存区

*git add .*                             把所有更改的文件添加到暂存区

*git status*                            查看状态

*git commit -m "xxx"*              提交文件

git commit [file1] [file2]... -m [message]          将指定文件添加到本地分支

### 撤销和删除操作

*1.git checkout .*    //放弃所有更改操作  修改test.js的内容,然后执行git checkout . 你会发现你所有的修改都没了

*git checkout -- xxx*  放弃对xxx文件的修改

*2.git clean -fd*      //删除新增文件但没对其执行过 git add 的文件

*3.rm .git -rf*          // 删除仓库(或者直接删除隐藏文件夹.git)

### 版本控制

*git reset --hard xxxxxx*   将本地库切换至指定版本，xxxxxx表示指定版本号

### 分制管理

*git branch*                    查看所有本地分支(当前分支会有*)

*git branch -a*                查看所有分支(包含本地和远程)(当前分支会有*)

*git branch xxx*              创建一个新的xxx分支

*git checkout xxx*           切换至xxx分支

*git checkout -b xxx origin/yyy*   以远程yyy分支为蓝本拉取到本地并新建一个名为xxx的本地分支

*git push origin xxx:xxx*   在远程仓库创建一个分支，并把本地分支的此分支提交至该创建的分支上。前面一个xxx代表本地分支，后面一个代表远程分支

*git push origin --delete xxx*   删除远程分支xxx

