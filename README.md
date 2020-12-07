#### hello_new_world  
>"待機中のメンバーがjavaのSPRING bootフレームワークを勉強するための環境です。"起動するため、必要な技術 →GIT、Eclipse、PostgreSQL（ロカールDB)  ####それぞれの機能をインストールしてください。「以下の全手順はWINDOWS版です。」

※GITインストール手順
 参考サイト→https://qiita.com/taketakekaho/items/75161e1273dca98cb4e1

※Eclipseをインストール
 参考サイト→https://oenblog.com/program/eclipse-install/#toc2

※PostgreSQLインストール手順
 参考サイト→https://programming-style.com/postgresql/reference/install-win/
 パスワードは「password」を定義

※PostgreSQLのSQL SHELL (psql)でロカールDB作成、テブール、デミデータ作成手順
 # create database testdb;
 # create table task (
    id              serial   primary key,   -- ID
    name            varchar(50),            -- タスク名
    tantosha        varchar(20)             -- 担当名
);
 # insert into task (name, tantosha) values
   ('タスク１', 'Aさん'),
   ('タスク２', 'Bさん')；

※プロジェクトをGITからダウンロード手順
  GITをインストール完了したら、Git Bashを使って以下のコマンドを実施
  ※cdでダウンロードしたい場所へ移動
  ※git clone https://github.com/seattleconsulting/hello_new_world.git

※cloneしたプロジェクトをEclipse開いて、インプット「一般→フォルダまだはアーカイブからプロジェクト」してください
 「SPRING boot アプリケーション」で実施
 「http://localhost:8090/task」行けば、画面表示できればOK
