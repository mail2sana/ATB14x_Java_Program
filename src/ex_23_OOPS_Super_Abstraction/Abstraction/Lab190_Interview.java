package ex_23_OOPS_Super_Abstraction.Abstraction;

public class Lab190_Interview {
}
// creating multiple interface is allowed - yes
interface I11{}
interface I12{}
class A1{}
class B1{}

 // class Test2 extends A1,B1{} this is not allowed
class Test3 implements I11{}
class Test4 implements I11, I12{}
class Test5 extends A1 implements I11, I12{}
//class Test6 implements I11 extends A1{} not allowed
// interface I12 extends A1{} - not allowed



