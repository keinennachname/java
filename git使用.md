<h2>仓库创建和入库操作</h2>
设置用户名密码
git config --global user.email "xxxx"
git config -- global user.name "xxxx"
git config --global --list   查看配置结果

git inti 初始化git仓库

将文件添加到仓库
  git add xxx  添加xxx文件到仓库
  git add .   把所有更改的文件添加到仓库

git status    查看状态

git commit -m "xxx"   提交文件

撤销和删除操作
1.git checkout .    //放弃所有更改操作  修改test.js的内容,然后执行git checkout . 你会发现你所有的修改都没了
2.git clean -fd      //删除新增文件但没对其执行过 git add 的文件
3.rm .git -rf          // 删除仓库(或者直接删除隐藏文件夹.git)

git remote add origin xxx   连接远程仓库
git push -u origin master   将本地代码提交至远程仓库