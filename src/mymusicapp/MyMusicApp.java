/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusicapp;

import java.util.ArrayList;
import java.util.Arrays;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.theory.Chord;
import org.jfugue.theory.ChordProgression;
//import org.jfugue.theory.Note;

public class MyMusicApp {

    public static String[] sad() {

        int count = (int) (Math.random() * 20) + 10;

        String[] acordes = {"CminWW", "DminWW", "EminWW", "FminWW", "GminWW", "AminWW", "BminWW"};
        //String[] notas = {"Ch", "Dh", "Eh", "Fh", "Gh", "Ah", "Bh", "Ch"};
        ArrayList<String> acords = new ArrayList<>();

        String cords = "";
        String notes = "";

        for (int c = 0; c < count; c++) {
            int numero = (int) (Math.random() * 6);
            //System.out.println(acordes[numero]);

            cords = cords + " " + acordes[numero];
            acords.add(acordes[numero]);
            //System.out.println(cords);
        }

        //String[] acords2 = (String[]) acords.toArray();
        for (int i = 0; i < acords.toArray().length; i++) {
            if (acords.get(i).equals("CminWW")) {
                //System.out.println("C");
                notes = notes + " " + "Ch Ebh Gh Ch";
            } else {
                if (acords.get(i).equals("DminWW")) {
                    //System.out.println("D");
                    notes = notes + " " + "Dh Fh Ah Dh";
                } else {
                    if (acords.get(i).equals("EminWW")) {
                        //System.out.println("E");
                        notes = notes + " " + "Eh Gh Bh Eh";
                    } else {
                        if (acords.get(i).equals("FminWW")) {
                            //System.out.println("F");
                            notes = notes + " " + "Fh Abh Ch Fh";
                        } else {
                            if (acords.get(i).equals("GminWW")) {
                                //System.out.println("G");
                                notes = notes + " " + "Gh Bbh Dh Gh";
                            } else {
                                if (acords.get(i).equals("AminWW")) {
                                    //System.out.println("A");
                                    notes = notes + " " + "Ah Ch Eh Ah";
                                } else {
                                    if (acords.get(i).equals("BminWW")) {
                                        //System.out.println("B");
                                        notes = notes + " " + "Bh Dh F#h Bh";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(notes);

        String[] song = {cords, notes};
        return song;

    }

    public static String[] happy() {

        int count = (int) (Math.random() * 20) + 10;

        String[] acordes = {"CmajW", "DmajW", "EmajW", "FmajW", "GmajW", "AmajW", "BmajW"};
        //String[] notas = {"Ch", "Dh", "Eh", "Fh", "Gh", "Ah", "Bh", "Ch"};
        ArrayList<String> acords = new ArrayList<>();

        String cords = "";
        String notes = "";

        for (int c = 0; c < count; c++) {
            int numero = (int) (Math.random() * 6);
            //System.out.println(acordes[numero]);

            cords = cords + " " + acordes[numero];
            acords.add(acordes[numero]);
            //System.out.println(cords);
        }

        //String[] acords2 = (String[]) acords.toArray();
        for (int i = 0; i < acords.toArray().length; i++) {
            if (acords.get(i).equals("CmajW")) {
                //System.out.println("C");
                notes = notes + " " + "Cq Eq Gq Cq";
            } else {
                if (acords.get(i).equals("DmajW")) {
                    //System.out.println("D");
                    notes = notes + " " + "Dq F#q Aq Dq";
                } else {
                    if (acords.get(i).equals("EmajW")) {
                        //System.out.println("E");
                        notes = notes + " " + "Eq G#q Bq Eq";
                    } else {
                        if (acords.get(i).equals("FmajW")) {
                            //System.out.println("F");
                            notes = notes + " " + "Fq Aq Cq Fq";
                        } else {
                            if (acords.get(i).equals("GmajW")) {
                                //System.out.println("G");
                                notes = notes + " " + "Gq Bq Dq Gq";
                            } else {
                                if (acords.get(i).equals("AmajW")) {
                                    //System.out.println("A");
                                    notes = notes + " " + "Aq C#q Eq Aq";
                                } else {
                                    if (acords.get(i).equals("BmajW")) {
                                        //System.out.println("B");
                                        notes = notes + " " + "Bq D#q F#q Bq";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(notes);

        String[] song = {cords, notes};
        return song;
    }


    public static void main(String[] args) {
        ChordProgression cp = new ChordProgression("I IV VII III VI II5dis V");

        String[] sadness = happy();
        System.out.println(sadness[0]);
        Chord[] chords = cp.setKey("D").getChords();
        for (Chord chord : chords) {
            Player player = new Player();
            // player.play("V0 I[flute]" + sadness[1] + " V1 I[piano]" + sadness[0]);
            
            //player.play("V0 T[Andantino] I[piano] Cq Eq Gq Cq Fq Aq Cq Fq Gq Bq Dq Gq Aq Cq Eq Aq Cq Eq Gq Cq V1 T[Andantino] I[piano]  CmajW FmajW GmajW AminW CmajW");

            Pattern p1 = new Pattern("V0 I[Piano]" + sadness[1]);
            Pattern p2 = new Pattern("V1 I[Piano]"+ sadness[0]);
            player.play(p1, p2);

        }
    }

}
