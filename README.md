# IoFile
这是一个关于Java文件写入操作的代码，有两种方式<br> 
pan包下的基于GUI有图形界面<br> 
pp包下的只是一个简单的黑框下的文件操作<br> 
值得注意的是：<br> 
在实际写入文件时，有两种写入文件的方式：覆盖和追加。<br> 
其中“覆盖”是指清除原文件的内容，写入新的内容，默认采用该种形式写文件，<br> 
“追加”是指在已有文件的末尾写入内容，保留原来的文件内容，例如写日志文件时，一般采用追加。<br> 
在实际使用时可以根据需要采用适合的形式，可以使用: <br> 
public FileOutputStream（String name， boolean append） throws FileNotFoundException <br> 
只需要使用该构造方法在构造FileOutputStream对象时，将第二个参数append的值设置为true即可。<br> 
```
try {
         BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
         out.write("aString");
         out.close();
} catch (IOException e) {
}
```
这种情况就是覆盖的<br>
```
try {
         BufferedWriter out = new BufferedWriter(new FileWriter("filename", true));
         out.write("aString");
         out.close();
} catch (IOException e) {
}
```
这种情况是添加
