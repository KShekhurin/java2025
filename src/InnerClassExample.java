class Outer {
    // public внутренний класс — доступен везде, где доступен Outer
    public class PublicInner {
        void show() {
            System.out.println("PublicInner");
        }
    }

    // protected внутренний класс — доступен в подклассах Outer и в том же пакете
    protected class ProtectedInner {
        void show() {
            System.out.println("ProtectedInner");
        }
    }

    // default (package-private) внутренний класс — доступен только в пакете
    class DefaultInner {
        void show() {
            System.out.println("DefaultInner");
        }
    }

    // private внутренний класс — доступен только внутри Outer
    private class PrivateInner {
        void show() {
            System.out.println("PrivateInner");
        }
    }

    public void demo() {
        // Внутри Outer все классы доступны
        new PublicInner().show();
        new ProtectedInner().show();
        new DefaultInner().show();
        new PrivateInner().show();
    }
}

class AnotherClassInSamePackage {
    void test() {
        Outer outer = new Outer();
        new Outer().new PublicInner().show();      // доступно
        new Outer().new ProtectedInner().show();   // доступно, тот же пакет
        new Outer().new DefaultInner().show();     // доступно, тот же пакет
        // new Outer().new PrivateInner().show();  // ошибка, private недоступен
    }
}