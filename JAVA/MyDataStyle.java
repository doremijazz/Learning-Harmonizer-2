package com.example.learningharmonizer;

import java.util.ArrayList;

final class MyDataStyle {
        private final ArrayList<String> accords_du_style;
        private final String[][][] algo_du_style;
        private final String [] degres_du_style;
        private final ArrayList<Integer> chord_pich;

        public MyDataStyle(ArrayList<String> first, String[][][] second, String[] third, ArrayList<Integer> fourt) {
            this.accords_du_style = first;
            this.algo_du_style = second;
            this.degres_du_style = third;
            this.chord_pich = fourt;
        }

        public ArrayList<String> getFirst() {
            return accords_du_style;
        }

        public String[][][] getSecond() {
            return algo_du_style;
        }

        public String[] getThird (){return degres_du_style;}

    public ArrayList<Integer> getfourt (){return chord_pich;}
    }

