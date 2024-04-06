import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        File f = new File();
        f.salvarArquivo("Come As You Are;Nirvana;219;1.09\n" +
                "Smells Like Teen Spirit;Nirvana;301;1.29\n" +
                "Boa Sorte / Good Luck;Vanessa da Mata, Ben Harper;226;1.19\n" +
                "I Want to Hold Your Hand;The Beatles;149;0.99\n" +
                "Like a Rolling Stone;Bob Dylan;368;1.39\n" +
                "Hey Jude;The Beatles;431;1.49\n" +
                "Hurt;Johnny Cash;218;1.09\n" +
                "Take Me Home, Country Roads;John Denver;191;0.89\n" +
                "Stairway to Heaven;Led Zeppelin;482;1.59\n" +
                "Wish You Were Here;Pink Floyd;334;1.29\n" +
                "Sweet Child o' Mine;Guns N' Roses;356;1.39\n" +
                "Black;Pearl Jam;334;1.29\n" +
                "Yesterday;The Beatles;126;0.79\n" +
                "Let It Be;The Beatles;243;1.09\n" +
                "Imagine;John Lennon;184;0.99\n" +
                "Hallelujah;Jeff Buckley;286;1.29\n" +
                "Bohemian Like You;The Dandy Warhols;204;1.19\n" +
                "Nothing Else Matters;Metallica;388;1.49\n" +
                "Hotel California;Eagles;391;1.49\n" +
                "Under the Bridge;Red Hot Chili Peppers;255;1.19\n" +
                "Losing My Religion;R.E.M.;269;1.09\n" +
                "Every Breath You Take;The Police;243;1.09\n" +
                "I Will Always Love You;Whitney Houston;273;1.29\n" +
                "Livin' on a Prayer;Bon Jovi;243;1.09\n" +
                "Hotel California;Eagles;391;1.49\n" +
                "Come Together;The Beatles;259;1.19\n" +
                "Black Hole Sun;Soundgarden;320;1.29\n" +
                "Tears in Heaven;Eric Clapton;270;1.09\n" +
                "Eye of the Tiger;Survivor;245;1.09\n" +
                "A Whiter Shade of Pale;Procol Harum;295;1.29", "src/main/VitorMusicas.csv");

    }
}
