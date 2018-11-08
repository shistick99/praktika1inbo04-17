package com.company;
import  java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int[] player_1 = {5, 1, 2, 3, 4};
        int[] player_2 = {0, 6, 7, 8, 9};
        ArrayList<Integer> first_player = new ArrayList<>();
        ArrayList<Integer> second_player = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            first_player.add(player_1[i]);
            second_player.add(player_2[i]);
        }
        int count = 0;
        boolean res = false;
        for (int i = 0; i < 106; i++) {
            count++;
            if (first_player.get(0) < second_player.get(0) || ((first_player.get(0) == 9) && (second_player.get(0) == 0))) {
                second_player.add(second_player.get(0));
                second_player.add(first_player.get(0));
            }
            else if (first_player.get(0) > second_player.get(0) || ((first_player.get(0) == 0) && (second_player.get(0) == 9))) {
                first_player.add(first_player.get(0));
                first_player.add(second_player.get(0));
            }
            first_player.remove(0);
            second_player.remove(0);
            if (first_player.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (second_player.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}