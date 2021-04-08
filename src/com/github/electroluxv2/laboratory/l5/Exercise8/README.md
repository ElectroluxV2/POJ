# Exercise 8
Dokonaj interpretacji działania poniższego programu:<br>

```java
public class App {
    public static void main(final String[] args) {
        System.out.println("A" == "A");
        System.out.println("A".equals("A"));
        System.out.println("---");
        System.out.println("A" == new String("A"));
        System.out.println("A".equals(new String("A")));
        System.out.println("---");
        System.out.println("A" == String.valueOf("A"));
        System.out.println("A".equals(String.valueOf("A")));
        System.out.println("---");
        System.out.println(new String("A") == String.valueOf("A"));
        System.out.println(new String("A").equals(String.valueOf("A")));
        System.out.println("---");
        System.out.println(new String("A").intern() == "A");
        System.out.println("\n---");
        for (int i = 0; i <= 500; i++) {
            if (Integer.valueOf(i) != Integer.valueOf(i)) {
                System.out.println("Index: " + i);
                break;
            }
        }
    }
}
```

# Result
![Result](./img.png?raw=true)