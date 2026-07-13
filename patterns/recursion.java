

class recursion {
    int count = 0;
 void print() {
    if (count == 5) {
        return;
    }
    count++;
    System.out.println(count);
    print();
}
    public static void main(String[] args) {
        recursion r = new recursion();
        r.print();
    }
}
