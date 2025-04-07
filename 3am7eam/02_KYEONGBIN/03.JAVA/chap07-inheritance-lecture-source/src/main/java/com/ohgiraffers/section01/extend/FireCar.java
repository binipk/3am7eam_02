package com.ohgiraffers.section01.extend;

// 🚒 FireCar (소방차) 클래스 정의 - Car 클래스를 상속받음
public class FireCar extends Car {

    // 🔥 FireCar의 생성자
    public FireCar() {
        /*
         * ✅ super()의 역할
         * - 모든 생성자에는 **첫 줄에 `super();`**가 자동으로 추가됨 (컴파일러가 자동 삽입)
         * - `super();`는 부모(Car) 클래스의 **기본 생성자**를 호출하는 역할을 함
         * - 부모의 생성자를 명시적으로 호출할 수도 있고, 생략하면 자동으로 호출됨
         */
        super(); // 부모(Car) 클래스의 기본 생성자 호출
        System.out.println("FireCar 클래스의 기본생성자 호출됨...");
    }

    /*
     * ✅ @Override 어노테이션
     * - JDK 1.5부터 추가된 기능
     * - 부모 클래스의 메서드를 **재정의(오버라이딩)할 때** 사용
     * - **정확히 오버라이딩이 되었는지 검증**해 줌 (틀리면 컴파일 에러 발생)
     * - 오버라이딩을 할 때는 부모의 메서드 선언과 **반환 타입, 메서드명, 매개변수**가 동일해야 함
     */
    @Override
    public void soundHorn() {
        // 🚒 소방차가 달리는 중이라면 경적을 다르게 울림
        if (isRunning()) {
            System.out.println("빠아아아아아아아아앙 ~~~~빠아아아아아아앙!!!!🎶🎶🎶🎶🎶🎶");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다!!! 비키세요 비켜~~~~~~~~~~");
        }
    }

    // 🚿 소방차의 물 뿌리는 기능 추가
    public void sprayWater() {
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다. =============>>>>>>>>>>>>>");
    }
}
