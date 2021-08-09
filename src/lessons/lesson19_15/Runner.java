package lessons.lesson19_15;

import java.util.*;
import java.util.stream.IntStream;

public class Runner {
    public static void main(String[] args) {
        String s = "The year of 1998 was announced by UNESCO the Year of Pushkin. In this way the mankind paid tribute to the genius of the Russian literature in commemoration of his 200th anniversary, which was celebrated world wide in June 1999.\n" +
                "\n" +
                "A. Pushkin was a Russian poet, novelist, dramatist, and short-story writer. He is considered his country’s greatest poet and the founder of modern Russian literature. He is the author of «Yevgeny Onegin», «little Tragedies», «The Queen of Spades», «Boris Godunov» and wonderful verses and fairy tales.\n" +
                "\n" +
                "We have grown up with his learned cat, who walked round and round the oak-tree, singing songs as he circled right, and telling tales as he circled left. We were fond of his exiled Prince, who was turned into a bumble-bee so that he could fly to his father’s court and sting his wicked aunt on the nose. Later we experienced Onegin’s boredom, Tatiana’s unrequited love, Godunov’s uneasy conscience, Herman’s tension at the gaming table, Saliere’s jealousy of Mozart, and heard the dead steps of the Stone Guest and the thundering hooves of the Bronze Horseman.\n" +
                "\n" +
                "His life was no less exciting than his works. He was born in Moscow on the 6th of June 1799. His father came of an old boyar family. His mother was a granddaughter of Abram Hannibal, who, according to family tradition, was an Abyssinian princeling bought as a slave at Constantinople (Istanbul) and adopted by Peter the Great and became his comrade in arms. Pushkin immortalized him in an unfinished historical novel, Arap Petra Velikogo (The Negro of Peter the Great). Like many aristocratic families in early 19th century Russia, Pushkin’s parents adopted French culture. Alexander and his brother and sister learned to talk and to read in French. The children were left much to the care of their maternal grandmother, who told Alexander stories of his ancestors in Russian. From his old nurse Arina Rodionovna Yakovleva, a freed serf, he heard Russian folktales. During summers at his grandmother’s estate near Moscow he talked to the peasants and spent hours alone, living in the dream world of an imaginative child. He read a lot and gained stimulus from the literary guests who came to the house.\n" +
                "\n" +
                "In 1811 Pushkin entered the newly founded Imperial Lyceum at Tsarskoye Selo and there began his literary career. Here he wrote a number of verses following the style of the Romantic poets.\n" +
                "\n" +
                "While at the Lyceum Pushkin also began his first completed major work, the romantic poem Ruslan i Lyudmila with an old Russian setting and making use of Russian folklore. It brought Pushkin fame, and Zhukovsky presented his portrait to the poet with the inscription «To the victorious pupil from the defeated master».\n" +
                "In 1817 Pushkin accepted a post in the foreign office at St. Petersburg. He joined the Green Lamp association founded for discussion of literature and history but in reality a branch of a secret society, the Union of Welfare. In his political verses and epigrams he made himself the spokesman for the ideas and aspirations of the participants of the Decembrist rising of 1825. For these political poems, Pushkin was banished from St. Petersburg to a remote southern province.\n" +
                "\n" +
                "He travelled in the Caucasus, the Crimea and gained the impressions for his «southern cycle» of romantic narrative poems: «Kavkazsky plennik» (The Prisoner of the Caucasus), «Bratya razboyniki» (The Robber Brothers), and «Bakhchisaraysky fontan» (The Fountain of Bakhchisaray).\n" +
                "\n" +
                "In 1823 he started work on his central masterpiece, the novel in verse «Yevgeny Onegin» (1833).\n" +
                "\n" +
                "From 1820 to 1824 he stayed in Kishinyov and Odessa. He led the life of a society, fought several duels, and was discharged and exiled to Mikhaylovskoye, near Pskov.\n" +
                "\n" +
                "Although the two years at Mikhaylovskoye were unhappy for Pushkin, they were one of his most productive periods. Alone and isolated, he wrote «Tsygany» (The Gypsies), «Yevgeny Onegin», the poem «Graf Nulin» (Count Nulin), the historical tragedy «Boris Godunov».\n" +
                "\n" +
                "Another extremely productive period is connected with Boldino, a family’s estate near Nizhny Novgorod. There he wrote the so-called «Little Tragedies» — «Skupoy rytsar» (The Covetous Knight), «Motsart i Salyeri» (Mozart and Salieri), «Kamenny gost» (The Stone Guest), and «Pir vo vremya chumy» (Feast in Time of the Plague) and the famous short story «Pikovaya Dama» (The Queen of Spades).\n" +
                "\n" +
                "Eventually, he was allowed to return to St. Petersburg. Soon marriage to one of the leading beauties of the society brought its problems. Pushkin was mortally wounded defending his wife’s honour in a duel. And died on February 10, 1837.\n" +
                "\n" +
                "Pushkin’s use of the Russian language is astonishing in its simplicity and profundity. His novel in verse «Yevgeny Onegin» was the first Russian work depicting contemporary society and pointing the way to the Russian realistic novel of the mid-19th century. Pushkin’s importance as a great national poet was recognized even during his lifetime. Pushkin was the creator of the Russian literary language and stood as the cornerstone of Russian literature, «the beginning of beginnings». Pushkin has thus become an inseparable part of the literary world of the Russian people. He also exerted a profound influence on other aspects of Russian culture, most notably in opera.\n" +
                "\n" +
                "Pushkin’s work has struck an echo all over the world with its nobility of conception, its emphasis on civic responsibility, its life-affirming vigour, and its confidence in the triumph of reason over prejudice, of human charity over slavery and oppression.\n" +
                "\n" +
                "His works are translated into all the major languages. They are transcending national barriers expressing most completely Russian national consciousness.";
        String text = s.replaceAll("\\p{P}", "");
        List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));

        Map<Integer, String> unsortedMap = new HashMap<>();


        for (int i = 0; i < myList.size() - 1; i++) {
            int counter = 1;
            String current = myList.get(i);
            for (int j = i + 1; j < myList.size(); j++) {

                String next = myList.get(j);
                if (current.equals(next)){
                    counter++;
                    myList.remove(j);
                }
            }
            if (counter >= 10){
                unsortedMap.put(counter, myList.get(i));
            }
            myList.remove(i);
        }

        Map<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

        System.out.println(sortedMap);

        for (int i = sortedMap.size(); i < 0; i--) {

        }


    }
}
