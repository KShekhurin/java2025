class Outer {
    class Inner {
        private int privateField = 10;
        int defaultField = 20;
        protected int protectedField = 30;
        public int publicField = 40;

        private void privateMethod() {
            System.out.println("Inner privateMethod: " + privateField);
        }

        public void publicMethod() {
            System.out.println("Inner publicMethod: " + publicField);
        }
    }

    public void accessInner() {
        Inner inner = new Inner();

        // Внешний класс имеет доступ ко всем полям внутреннего класса
        System.out.println(inner.privateField);   // private
        System.out.println(inner.defaultField);   // default
        System.out.println(inner.protectedField); // protected
        System.out.println(inner.publicField);    // public

        // Внешний класс может вызвать все методы внутреннего класса
        inner.privateMethod(); // private
        inner.publicMethod();  // public
    }
}

void main(String[] args) {
    Outer outer = new Outer();
    outer.accessInner();
}