package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
Создать 10 зергов, 5 протоссов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args) {
        Zerg first = new Zerg();
        first.name = "Bla";
        Zerg s = new Zerg();
        s.name = "Ba";
        Zerg q = new Zerg();
        q.name = "qqa";
        Zerg w = new Zerg();
        w.name = "Bww";
        Zerg ee = new Zerg();
        ee.name = "eecgfjrf";
        Zerg hg = new Zerg();
        hg.name = "Blghka";
        Zerg nnb = new Zerg();
        nnb.name = "Blhja";
        Zerg firstq = new Zerg();
        firstq.name = "Blqa";
        Zerg firstf = new Zerg();
        firstf.name = "Blaf";
        Zerg firstfh = new Zerg();
        firstfh.name = "Blghaf";

        Protoss protik = new Protoss();
        Protoss protik2 = new Protoss();
        Protoss protik3 = new Protoss();
        Protoss protik4 = new Protoss();
        Protoss protik5 = new Protoss();
        protik.name = ("FF");
        protik2.name = ("FF2");
        protik3.name = ("FF3");
        protik4.name = ("FF4");
        protik5.name = ("FF5");

        Terran ter = new Terran();
        Terran ter2 = new Terran();
        Terran ter3 = new Terran();
        Terran ter4 = new Terran();
        Terran ter5 = new Terran();
        Terran ter6 = new Terran();
        Terran ter7 = new Terran();
        Terran ter8 = new Terran();
        Terran ter9 = new Terran();
        Terran ter10 = new Terran();
        Terran ter11 = new Terran();
        Terran ter12 = new Terran();

        ter.name = "Lkj";
        ter2.name = "Lkj2";
        ter3.name = "Lkj3";
        ter4.name = "Lk4j";
        ter5.name = "7Lkj";
        ter6.name = "Lk5j";
        ter7.name = "Lk78j";
        ter8.name = "L11kj";
        ter9.name = "Lk22j";
        ter10.name = "L33kj";
        ter11.name = "L44kj";
        ter12.name = "L55kj";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
