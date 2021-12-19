package chapter3.ch15;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<>(); // 생성자가 호출 될 때 초기화 하는 것이 좋다.
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }




}

