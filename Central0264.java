/*Habiba Basri
* 13020210264
*/
package central0264;
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0264 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0264 obj = new Central0264();
        System.out.println("main");
        obj.aaa();
    }
}