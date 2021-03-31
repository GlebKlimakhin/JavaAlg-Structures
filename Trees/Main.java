package Trees;

public class Main {
    public static void main(String[] args) {
        double counterBalanced = 0;
        for (int i = 0; i < 20000; i++) {
            MyTreeMap<Integer, Integer> myMap = new MyTreeMap<>();
            fill(myMap);
            if(myMap.isBalanced()){
                counterBalanced++;
            }
        }

        System.out.println("Процент сбалансированных мап: " + Math.round(counterBalanced/20000 * 100) + " %");
    }

    private static MyTreeMap<Integer, Integer> fill(MyTreeMap<Integer, Integer> myTreeMap){
        while (myTreeMap.height() != 6){
            myTreeMap.insert( (int) (Math.random() * 100 + Math.random() * (-100)),
                    ( (int) (Math.random() * 100 + Math.random() * (-100))));
        }
        return myTreeMap;
    }
}
