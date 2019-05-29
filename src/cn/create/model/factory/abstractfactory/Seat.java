package cn.create.model.factory.abstractfactory;

public interface Seat {
      void      message();
}
class LuxurySeat implements Seat{
        @Override
        public void message() {
                System.out.println("可以自动按摩的座位");
        }
}
class LowSeat implements Seat{
        @Override
        public void message() {
                System.out.println("不能自动按摩的座位");
        }
}
