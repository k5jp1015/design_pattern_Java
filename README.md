# design_pattern_Java
## Adapter

- すでに提供されているモジュールがそのまま使えない場合に、必要な形に変換してから利用するためにつかうもの
- 「すでに提供されているもの」と「必要なもの」の間のズレを埋める
- 既存ソースに対して、手を入れずに目的のインターフェースに合わせるときなどに用いる

## Template

- スーパークラスで処理wの枠組みを定め、サブクラスで具体的内容を定めるようなデザインパターン
- ローンパターンもこのTemplete Patternに該当すると思われる 

## Factory 
- Template Methodパターンでは、スーパークラス側で処理の骨組みを作り、サブクラス側で具体的な処理の肉付けをしたが、  
このパターンではインスタンス生成の場面で適用される
- Factory Methodパターンでは、インスタンスの作り方をスーパークラスの側で定めるが、具体的なクラス名までは定めない
- 具体的な肉付けは、すべてサブクラスの側でやる

| パッケージ  | 名前  | 解説  |
|---|---|---|
| framework  |  Product | 抽象メソッドuseのみ定義されている抽象クラス |
| framework  | Factory  | 目ドッドcreateを実装している抽象クラス  |
| idcard  | IDCard  | メソッドuseを実装しているクラス  |
| idcard  | IDCardFactory  | メソッドcreateProduct,registerproductを実装しているクラス  |
| -  | Main  | 動作テスト用のクラス  |

## Singleton
- システムの中に1個しか存在しない者をプログラムで表現したいときに用いる
- 指定したクラスのインスタンスが絶対に1子kしか存在しないことを保証したい
- インスタンスが1個しか存在しないことをプログラム上で表現したい

| 名前  | 解説  |
|---|---|
| Singleton  | インスタンスが1つしか存在しないクラス  |
| Main  | 動作確認用のクラス  |

## Prototype
- クラスからインスタンスを生成するのではなく、インスタンスをコピーして新しいインスタンスを作る
    1. 種類が多すぎてクラスにまとめられない場合
    2. クラスからのインスタンス生成が難しい場合
    3. フレームワークと生成するインスタンスを分けたい場合
- JavaのCloneメソッドとCloneableインターフェースを用いる

| パッケージ  |  名前 |  解説 |
|---|---|---|
| framework  | Product  |  抽象メソッドuseとcreateCloneが宣言されているインタフェース |
| framework  |  Manager | createCloneを使ってインスタンスを複製するクラス  |
| 無名  | MessageBox  |  文字列を枠線で囲って表示するクラス。useとcreateCloneを実装している |
| 無名  | UnderlinePen  | 文字列に下線を引いて表示するクラス。useとcreateCloneを実装している  |
| 無名  |  Main |  動作テスト用のクラス |

## Builder
- 複雑なクラスを生成するために用いるデザインパターン
| 名前  | 解説  |
|---|---|
| Builder  | 文章を構成するためのメソッドを定めた抽象クラス  |
| Director  |  1つの文章を作るクラス |
| TextBuilder  | プレーンテキスト(普通の文字列)をつかって文章を作るクラス  |
| HTMLBuilder  | HTMLファイルを使って文章を作るクラス  |
| Main  | 動作テストと用のクラス  |

- MainクラスはBuilderクラスのメソッドを知らない。  
Mainクラスは、Directorクラスのconstructメソッドだけを呼び出す

- Directorクラスが知っているのはBuildeクラス。DirecotrクラスはBuilderクラスのメソッドを使って文章を構築する  
しかし、Directorクラスは、自分が実際に利用しているクラスが実際に何を用いているのかを知らない。  
知らないことのメリットは入れ替えができるということ。  
入れ替えが正しく機能するのはDirectorクラスがBuilderクラスの具体的なサブクラスを「知らない」から。

- 入れ替えができるからこそ、部品として「交換可能性」が担保できる分価値が高いといえる

## Abstract Factory
- Abstract Factoryでは「抽象的な部品」を用いて「抽象的な製品」を作り出す
    - 抽象的:「具体的にどのように実装されているかについては考えず、インターフェース(API)だけに注目している」状態


| パッケージ  |  名前 |  解説 |
|---|---|---|
| factory  | Factory  |  抽象的な工場を表すクラス(Link, Tray, pageを作る) |
| factory  | Item  | LinkとTrayを統一的に扱うためのクラス  |
| factory  | Link  | 抽象的な部品:HTMLのリンクを表すクラス  |
| factory  | Tray  | 抽象的な部品:LinkやTrayを集めたクラス  |
| factory  | Page  | 抽象的な製品:HTMLのページを表すクラス  |
| 無名  |  Main |  動作テスト用のクラス |
| listfactory | ListFactory  | 具体的な工場を表すクラス(ListLink, ListTray,ListPageを作る) |
| listfactory | ListLink  | 具体的な部品:HTMLのリンクを表すクラス |
| listfactory | Listtray  | 具体的な部品:HTMLのリンクを表すクラス |
| listfactory | ListPage  | 具体的な部品:HTMLのページを表すクラス | 