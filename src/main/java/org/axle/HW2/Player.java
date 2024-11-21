package org.axle.HW2;

/**
 * Задача 11. Класс "Игрок"
 * 1.	Создайте класс Player с полями:
 *  	nickname (никнейм, тип String), *  	level (уровень, тип int), *  	score (очки, тип int).
 * 2.	Реализуйте:  *  	Конструктор с параметрами для всех полей.  *  	Геттеры и сеттеры.
 *  	Метод levelUp(), который увеличивает уровень на 1.
 *  	Метод addScore(int points), который добавляет очки.
 *      Метод printPlayerInfo(), который выводит:  * Игрок: <nickname>, Уровень: <level>, Очки: <score>
 * * 3.	В методе main создайте игрока, поднимите уровень, добавьте очки и выведите данные.
 */
public class Player {
    private String nickname;
    private int level;
    private int score;


    public Player(String nickname, int level, int score) {
        this.nickname = nickname;
        this.level = level;
        this.score = score;
    }

    void levelUp(){
        int newLevel = getLevel() +1;
        setLevel(newLevel);
    }

    void addScore(int points){
        int newScore = getScore() + points;
        setScore(newScore);
    }

    void printPlayerInfo(){
        String info = (" Игрок: " + getNickname() +  ", Уровень: " + getLevel() + ", Очки: " + getScore());
        System.out.println(info);
    }






    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
