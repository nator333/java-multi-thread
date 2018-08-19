package jp.mixi.practice.java;

import java.util.ArrayList;
import java.util.List;

public class AnotherModel {

  public static final int MAX_ITEM = 10;
  private List<String> list;

  public AnotherModel() {
    // TODO: [課題1] list 変数を初期化する
    this.list = new ArrayList<>();
  }

  public void add(String item) {
    list.add(item);
  }

  public boolean canAddItem() {
    // TODO: [課題2] MAX_ITEM と比較して、list の中身の個数が MAX_ITEM より多い場合は false を返すように、return 文を書き換える
    if (list.size() < MAX_ITEM) {
      return true;
    } else {
      this.list.forEach(System.out::println);
      return false;
    }
  }

  public void remove(String item) {
    list.remove(item);
  }
}