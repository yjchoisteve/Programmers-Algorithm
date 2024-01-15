package programmars.java.level1;

public class E250137 {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // int maxTime = attacks[attacks.length - 1][0];
        int maxHealth = health;
        int bTime = 0;
        for (int[] atk : attacks) {
            int bandageTime = atk[0] - bTime - 1;
            health = Math.min(maxHealth, health + bandageTime * bandage[1]);
            health = Math.min(maxHealth, health + bandageTime / bandage[0] * bandage[2]);
            health -= atk[1];
            bTime = atk[0];
            if (health <= 0)
                return -1;
        }
        // for (int t = 0, bTime = 0, atkIdx = 0; t <= maxTime; t++, bTime++) {
        // if (t == attacks[atkIdx][0]) {
        // health -= attacks[atkIdx][1];
        // bTime = 0;
        // atkIdx++;
        // if (health <= 0) {
        // return -1;
        // }
        // } else {
        // health += bandage[1];
        // if (bTime == bandage[0]) {
        // bTime = 0;
        // health += bandage[2];
        // }
        // if (health > maxHealth) {
        // health = maxHealth;
        // }
        // }
        // }
        return health;
    }

    public static void main(String[] args) {
        System.out.println(new E250137().solution(new int[] { 1, 1, 1 }, 5, new int[][] { { 1, 2 }, { 3, 2 } }));
    }
}
