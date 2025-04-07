package com.ohgiraffers.section01.extend;

// 🏎️ RacingCar (레이싱카) 클래스 정의 - Car 클래스를 상속받음
public class RacingCar extends Car {

    // 🏁 RacingCar의 생성자
    public RacingCar() {
        /*
         * ✅ super()가 생략되어 있지만, 컴파일러가 자동으로 부모(Car) 클래스의 생성자를 호출함
         * - 즉, 부모(Car)의 기본 생성자가 먼저 실행된 후 RacingCar 생성자가 실행됨
         */
        System.out.println("RacingCar 클래스 기본 생성자 호출됨...");
    }

    /*
     * ✅ @Override를 사용하여 부모(Car) 클래스의 메서드를 오버라이딩
     * - 레이싱카는 일반 자동차와 달리 빠른 속도로 질주해야 하므로 `run()` 메서드를 재정의함
     */
    @Override
    public void run() {
        System.out.println("레이싱카가 전속력으로 질주합니다!!!!!!!!!!!!!!!!!!!");
    }

    /*
     * ✅ @Override: 경적 기능 변경
     * - 레이싱카는 경적을 울리지 않도록 `soundHorn()` 메서드를 재정의함
     */
    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울리지 않습니다.(조용.......)");
    }

    /*
     * ✅ @Override: 멈추는 기능 변경
     * - 레이싱카가 멈출 때의 동작을 재정의함
     */
    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }
}
