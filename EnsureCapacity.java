class EnsureCapacity {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello world was my first ever program");
        System.out.println("Before ensureCapacity " + "method capacity = " + str.capacity());
        str.ensureCapacity(78);
        System.out.println("After ensureCapacity" + " method capacity = " + str.capacity());
    }
}