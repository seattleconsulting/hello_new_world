pjbase_java
###
## 説明
このPJは待機中のメンバーがjavaのspringbootフレームワークを勉強するための環境です。
ロカールDBを用意して、SAMPLEデータのCRUDが一通り操作できます。
起動するため、GIT,Eclipse,PostgreSQLなど事前にインストールしてください。
###
## インストール手順
[GITインストール手順](https://qiita.com/taketakekaho/items/75161e1273dca98cb4e1)
###
[Eclipseをインストール](https://oenblog.com/program/eclipse-install/#toc2)
###
[PostgreSQLインストール手順](https://programming-style.com/postgresql/reference/install-win/)
DBユーザのパスワードは′password′を設定してください。

### ロカールDB作成、テブールやテストデータ作成手順
PostgreSQLのSQL SHELL (psql)で以下のコマンドを実施
> create database testdb;
PostgreSQLのSQL SHELL (psql)を再開いて、作成したtestdbを接続して以下のコマンドを実施
###
> create table task (
>    id              serial   primary key,  
>    name            varchar(50),            
>    tantosha        varchar(20)             
>);
###
> insert into task (name, tantosha) values
>   ('タスク１', 'Aさん'),
>   ('タスク２', 'Bさん')

### プロジェクトpjbase_javaをGITからダウンロード手順
GITをインストール完了したら、Git Bashを使って以下のコマンドを実施
> $ cdでダウンロードしたい場所へ移動
###
> $ git clone https://github.com/seattleconsulting/hello_new_world.git
###
### cloneしたプロジェクトpjbase_javaをEclipse開いてインプット、起動手順
###
>インプット「一般→フォルダまだはアーカイブからプロジェクト」してください
###
>  実施はSPRING boot アプリケーションで実施
###
[タスク一連画面]（http://localhost:8090/task)　行って画面表示できればOK
