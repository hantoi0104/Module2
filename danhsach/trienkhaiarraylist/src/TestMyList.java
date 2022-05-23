public class TestMyList {

    public static void main(String[] args) {
        MyList<Integer> myArrayList = new MyList<Integer>();
        myArrayList.add(5,1);
        System.out.println(myArrayList.get(5));
    }
}
