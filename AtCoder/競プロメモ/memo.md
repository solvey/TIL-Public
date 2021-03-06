# Javaでのよくある処理メモ
マークダウンのプレビュー方法
コマンド+K 離して Vを押す
## 入力系
### 文字列の受け取り  
cabbabaacaba  
String S = sc.next();  
char c = S.charAt(i);  

## 発想
* 最小値が欲しいからといってすぐMinを使うんじゃない
    * if(小<大>)
      大=小という手法もある